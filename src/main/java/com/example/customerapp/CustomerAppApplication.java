package com.example.customerapp;

import com.example.customerapp.entities.Customer;
import com.example.customerapp.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerAppApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("Mohamed").email("mohamed@gmail.com").build());
            customerRepository.save(Customer.builder().name("iheb").email("iheb@gmail.com").build());
            customerRepository.save(Customer.builder().name("akrem").email("akrem@gmail.com").build());
        };
    }
}
