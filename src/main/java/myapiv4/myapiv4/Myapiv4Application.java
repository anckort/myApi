package myapiv4.myapiv4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Myapiv4Application {

    public static void main(String[] args) {
        SpringApplication.run(Myapiv4Application.class, args);
        System.err.println("----------------------------------------------------Server started");
    }
}
