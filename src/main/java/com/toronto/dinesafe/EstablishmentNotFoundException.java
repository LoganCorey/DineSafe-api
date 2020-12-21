package com.toronto.dinesafe;

public class EstablishmentNotFoundException extends RuntimeException{

    EstablishmentNotFoundException(Long id) {
        super("Could not find establishment " + id);
    }
}
