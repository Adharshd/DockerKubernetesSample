package dockerSample;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CrmApplication {

 @GetMapping("/customer")
 public String getCustomer(@RequestParam String id) {
     // Dummy data for demonstration
     switch (id) {
         case "1": return "John Doe: Product Inquiry";
         case "2": return "Jane Smith: Follow-up Needed";
         default: return "Customer not found";
     }
 }
 
 
 @GetMapping("/")
 public String getHomePage() {
     // Dummy data for demonstration
     return "Welcome to CRM application";
     
     }
 

 public static void main(String[] args) {
     SpringApplication.run(CrmApplication.class, args);
 }
}
