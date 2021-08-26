package com.linkedin.apilinkedin.exceptions;

public class UsuarioNotFoundException extends RuntimeException {

    public UsuarioNotFoundException(String s) {
        super(s);
    }

    public UsuarioNotFoundException(String s, Throwable error) {
        super(s, error);
    }
}
