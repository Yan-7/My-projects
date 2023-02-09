package com.employeeApp2411;


import com.employeeApp2411.enteties.Employee;
import org.springframework.web.client.RestTemplate;

//add client
public class ClientApp3Post {
    public static void main(String[] args) {


        Employee employee = new Employee(6, "Beni", Employee.Department.LEGAL, 6000);

        RestTemplate rt = new RestTemplate();

        Employee emp = rt.postForObject("http://localhost:8080/yan/employees/add/", employee, Employee.class);


    }
}
