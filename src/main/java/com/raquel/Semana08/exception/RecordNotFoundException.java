package com.raquel.Semana08.exception;

public class RecordNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public RecordNotFoundException(Long id) {
        super("Registro não encotrado com o id: " + id);
    }
}
