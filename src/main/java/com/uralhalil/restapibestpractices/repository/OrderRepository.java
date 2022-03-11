package com.uralhalil.restapibestpractices.repository;

import com.uralhalil.restapibestpractices.model.Employee;
import com.uralhalil.restapibestpractices.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author HalilURAL
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
