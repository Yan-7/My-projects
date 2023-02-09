package com.employeeApp2411.repositories;

import com.employeeApp2411.enteties.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
