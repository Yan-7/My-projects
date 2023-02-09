package com.employeeApp2411;


import com.employeeApp2411.enteties.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

//get client
public class ClientApp2Get {
    public static void main(String[] args) {

        System.out.println("client app");

        RestTemplate rt = new RestTemplate();

        try {

            ResponseEntity<Employee> response  = rt.getForEntity("http://localhost:8080/yan/employees/get?id=11", Employee.class);
            System.out.println(response.getStatusCode());
            System.out.println("=========");
            Employee emp = response.getBody();
            System.out.println(emp);
        } catch (HttpClientErrorException e) {
            System.out.println(e.getStatusCode());
            System.out.println(e.getMessage());
        }
    }
}
