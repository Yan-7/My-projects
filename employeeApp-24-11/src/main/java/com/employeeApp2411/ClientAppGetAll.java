package com.employeeApp2411;

import com.employeeApp2411.enteties.Employee;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

public class ClientAppGetAll {
    public static void main(String[] args) {

        RestTemplate rt = new RestTemplate();

        String url = "http://localhost:8080/yan/employees/getAll";

        Employee[] arr = rt.getForObject(url, Employee[].class);
        for (Employee emp : arr) {
            System.out.println(emp);
        }
        System.out.println("------");
        List<Employee> list = Arrays.asList( rt.getForObject(url, Employee[].class));
        System.out.println(list);

    }
}
