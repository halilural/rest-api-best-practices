package com.uralhalil.restapibestpractices.repository;

import com.uralhalil.restapibestpractices.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author HalilURAL
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
