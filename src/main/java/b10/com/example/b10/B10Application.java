package b10.com.example.b10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("b10.com.example.b10")  // ADD THIS LINE
public class B10Application {
    public static void main(String[] args) {
        SpringApplication.run(B10Application.class, args);
    }
}
