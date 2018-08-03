package ch.meyenberger.webapps.dockertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockertestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockertestApplication.class, args);
    }

    @RequestMapping(value = "/hello")
    public String sayHello() {
        return "Hello World!";
        // Test Commit
    }
}
