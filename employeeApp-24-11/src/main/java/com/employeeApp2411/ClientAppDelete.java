package com.employeeApp2411;

import com.employeeApp2411.enteties.Employee;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

// TODO: 28/11/2022
public class ClientAppDelete {
    public static void main(String[] args) {

        RestTemplate rt = new RestTemplate();

        rt.delete("http://localhost:8080/yan/employees/delete",5);
    }
}
