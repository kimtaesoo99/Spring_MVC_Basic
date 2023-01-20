package com.example.spring_mvc_study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan //서블릿 자동 등록
@SpringBootApplication
public class SpringMvcStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcStudyApplication.class, args);
    }

}
