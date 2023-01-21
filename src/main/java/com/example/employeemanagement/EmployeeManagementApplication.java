package com.example.employeemanagement;

import com.example.employeemanagement.domain.Team;
import com.example.employeemanagement.repository.EmployeeRepository;
import com.example.employeemanagement.repository.TeamRepository;
import com.example.employeemanagement.service.EmployeeService;
import com.example.employeemanagement.service.TeamService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class EmployeeManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeManagementApplication.class, args);
    }

    @Bean
    CommandLineRunner init(TeamRepository teamRepository, EmployeeRepository employeeRepository) {
        return args -> {
            teamRepository.findAll().forEach(System.out::println);
            System.out.println();
            employeeRepository.findAll().forEach(System.out::println);
        };
    }

}
