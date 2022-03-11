package com.uralhalil.restapibestpractices.exception;

/**
 * @author HalilURAL
 */
public class OrderNotFoundException extends RuntimeException {

    public OrderNotFoundException(Long id) {
        super("Could not find order " + id);
    }
}
