package clients;

import com.dictionarypracticeREST.enteties.Entry;
import org.springframework.web.client.RestTemplate;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {

        System.out.println("=== CLIENT ===");

        RestTemplate rt = new RestTemplate();
        String baseUrl = "http://localhost:8080/api";

        try {
            Entry entry = rt.getForObject(baseUrl + "/get?entryId=3", Entry.class);
            System.out.println(entry);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
