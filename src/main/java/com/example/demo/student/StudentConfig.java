package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.APRIL;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student luca = new Student(
                    "Luca",
                    "luca@gmail.com",
                    LocalDate.of(2000, APRIL,4)
            );

            Student marco = new Student(
                    "Marco",
                    "marco@gmail.com",
                    LocalDate.of(2002, APRIL,4)
            );

            repository.saveAll(
                List.of(marco,luca)
            );
        };
    }
}
