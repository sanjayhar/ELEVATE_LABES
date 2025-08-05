package com.sanjayharish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Ultimate CI/CD Pipeline Spring Boot Application
 * Author: Sanjay Harish
 * Description: Deployed to Kubernetes using Argo CD with GitHub Actions
 */
@SpringBootApplication
@Controller
public class StartApplication {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "Welcome to the Ultimate CI/CD Pipeline");
        model.addAttribute("msg", "This Spring Boot application is deployed on Kubernetes using Argo CD and GitHub Actions.");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
