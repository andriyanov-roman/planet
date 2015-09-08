package planet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class ApplicationContext {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationContext.class, args);
    }
}
