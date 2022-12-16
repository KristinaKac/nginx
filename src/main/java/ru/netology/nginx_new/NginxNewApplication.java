package ru.netology.nginx_new;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class NginxNewApplication {
    @Value("${server.port}")
    private String port;

    @GetMapping("/")
    public String Hello (){
        return "Hello from " + port;
    }

    public static void main(String[] args) {
        SpringApplication.run(NginxNewApplication.class, args);
    }
}
