package com.vpt.pw.demo.exceptions;

import org.springframework.http.HttpStatus;

public class RestException extends RuntimeException {

    private HttpStatus statusCode;

    public RestException(HttpStatus statusCode, String msg) {
        super(msg);
        this.statusCode = statusCode;
    }

    public HttpStatus getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(HttpStatus statusCode) {
        this.statusCode = statusCode;
    }
}
