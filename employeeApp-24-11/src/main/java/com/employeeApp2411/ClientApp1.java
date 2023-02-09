package com.employeeApp2411;


import com.employeeApp2411.enteties.Employee;
import org.springframework.web.client.RestTemplate;

public class ClientApp1 {
    public static void main(String[] args) {

        System.out.println("client app");

        RestTemplate rt = new RestTemplate();

        Employee rt1 = rt.getForObject("http://localhost:8080/yan/employees/get?id=1", Employee.class);
        System.out.println(rt1);
    }
}
