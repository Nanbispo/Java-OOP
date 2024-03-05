package com.alura.ScreenMatch.Exceptions;

public class YearConversionErrorException extends RuntimeException {
    private String mensage;
    public YearConversionErrorException(String mensage) {
    this.mensage = mensage;
    }

    @Override
    public String getMessage() {
        return this.mensage;
    }
}
