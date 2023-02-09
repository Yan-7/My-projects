package clients;

import com.dictionarypracticeREST.enteties.Entry;
import com.dictionarypracticeREST.enteties.Example;
import org.springframework.web.client.RestTemplate;

public class DemoAdd {

    public static void main(String[] args) {

        System.out.println("=== CLIENT ===");

        RestTemplate rt = new RestTemplate();
        String baseUrl = "http://localhost:8080/api";

        Entry entry = new Entry(0, "Java", "a programmin language", null);
        entry.addExample(new Example(0, "Java is nice", null));
//        entry.addExample(new Example(0, "Java is good", null));
//        entry.addExample(new Example(0, "Java is great", null));
//        entry.addExample(new Example(0, "Java is love", null));

        try {
            Entry entryFromServer = rt.postForObject(baseUrl + "/add", entry, Entry.class);
            System.out.println(entryFromServer);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}