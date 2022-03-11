package com.uralhalil.restapibestpractices.exception;

/**
 * @author HalilURAL
 */
public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
