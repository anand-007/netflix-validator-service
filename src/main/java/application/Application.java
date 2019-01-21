package application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import application.data.MockData;

/**
 * Starter of Spring Boot Application
 * @author ecom-anandraj.t
 *
 */

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        
        // Initialize the mock Data will be removed in production
        MockData.initializeData();
    }
}
