package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student hamza = new Student(
                    1L,
                    "Hamza",
                    "hamza.youtube@gmail.com",
                    LocalDate.of(1997, Month.JULY, 19)
            );
            Student Bogdan = new Student(
                    "Bogdan",
                    "bohdan@wise.com",
                    LocalDate.of(2000, Month.APRIL, 15)
            );

            repository.saveAll(
                    List.of(hamza, Bogdan)
            );

        };
    }

}
