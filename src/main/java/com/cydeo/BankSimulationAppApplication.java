package com.cydeo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BankSimulationAppApplication {

    public static void main(String[] args) {

       ApplicationContext container= SpringApplication.run(BankSimulationAppApplication.class, args);

    }

}
