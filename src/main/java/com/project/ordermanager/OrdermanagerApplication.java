package com.project.ordermanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class OrdermanagerApplication {


    public static void main(String[] args) throws IOException {
       // SpringApplication.run(OrdermanagerApplication.class, args);
        Test.test();

    }
}
