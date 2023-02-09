package com.employeeApp2411.controllers;


import com.employeeApp2411.Exceptions.EmployeeExceptions;
import com.employeeApp2411.enteties.Employee;
import com.employeeApp2411.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/yan/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/get")
    public ResponseEntity<?> getEmployee(int id) {
        try {
            Employee emp = employeeService.getEmployee(id);
            return ResponseEntity.ok(emp);
        } catch (EmployeeExceptions e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,e.getMessage(),e);
        }

    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/update")
    public Employee update(@RequestBody Employee employee) {
        return employeeService.update(employee);
    }

    @DeleteMapping("/delete")
    public void deleteEmployee(@RequestBody int id) {
        employeeService.deleteEmployee(id);
    }

    @GetMapping("/getAll")
    public List<Employee> readAll() {
        return employeeService.readAll();
    }


}
