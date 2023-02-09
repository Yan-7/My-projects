package com.employeeApp2411;

import com.employeeApp2411.enteties.Employee;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;


public class ClientAppUpdate {
    public static void main(String[] args) {

        RestTemplate rt = new RestTemplate();

        String url1 = "http://localhost:8080/yan/employees/getAll";
        String url2 = "http://localhost:8080/yan/employees/update";

        List<Employee> list = Arrays.asList(rt.getForObject(url1,Employee[].class));
        System.out.println(list);
        System.out.println("--------");

        Employee newEmployee = list.get(1);
        newEmployee.setName("updatd-emp");
        System.out.println("employee updated");

        rt.put(url2, newEmployee);
        System.out.println(list);

    }
}
