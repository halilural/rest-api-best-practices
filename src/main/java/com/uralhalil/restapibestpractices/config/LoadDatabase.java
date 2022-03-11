package com.uralhalil.restapibestpractices.config;

import com.uralhalil.restapibestpractices.model.Employee;
import com.uralhalil.restapibestpractices.model.Order;
import com.uralhalil.restapibestpractices.model.Status;
import com.uralhalil.restapibestpractices.repository.EmployeeRepository;
import com.uralhalil.restapibestpractices.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author HalilURAL
 */

@Configuration
@Slf4j
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository, OrderRepository orderRepository) {

        return args -> {
            employeeRepository.save(new Employee("Bilbo", "Baggins", "burglar"));
            employeeRepository.save(new Employee("Frodo", "Baggins", "thief"));

            employeeRepository.findAll().forEach(employee -> log.info("Preloaded " + employee));


            orderRepository.save(new Order("MacBook Pro", Status.COMPLETED));
            orderRepository.save(new Order("iPhone", Status.IN_PROGRESS));

            orderRepository.findAll().forEach(order -> {
                log.info("Preloaded " + order);
            });

        };
    }

}
