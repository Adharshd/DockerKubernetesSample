// src/main/java/com/example/biservice/BiApplication.java
package biSample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BiApplication {

    @GetMapping("/analytics")
    public String getAnalytics() {
        // Dummy response for demonstration
        return "Total Customer Inquiries: 40";
    }
    
    
    
    @GetMapping("/")
    public String getHomePage() {
        // Dummy response for demonstration
        return "Welcome to the BI Application";
    }

    public static void main(String[] args) {
        SpringApplication.run(BiApplication.class, args);
    }
}
