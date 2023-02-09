package com.employeeApp2411.service;


import com.employeeApp2411.Exceptions.EmployeeExceptions;
import com.employeeApp2411.enteties.Employee;
import com.employeeApp2411.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
// business logic
public class EmployeeService {

    @Autowired
    private EmployeeRepository rep;

    public Employee addEmployee(Employee employee) {
        if (!rep.existsById(employee.getId())) {
            return rep.save(employee);
        } else {
            throw new RuntimeException();
        }

    }

    public Employee getEmployee(int id) {
        Optional<Employee> employee = rep.findById(id);
        if (employee.isPresent()) {
            return employee.get();
        } else {
            throw new  EmployeeExceptions("cannot find employee");

        }
    }

    public List<Employee> readAll() {
        return rep.findAll();
    }

    public Employee update(Employee employee) {
        if (rep.existsById(employee.getId())) {
            return rep.save(employee);
        } else {
            throw new EmployeeExceptions(" update failed - cannot find");
        }
    }


    public void deleteEmployee(int id) {
        if (rep.existsById(id)) {
            rep.deleteById(id);
        } else {
            throw new EmployeeExceptions("cannod delete");
        }

    }
    //-------
}