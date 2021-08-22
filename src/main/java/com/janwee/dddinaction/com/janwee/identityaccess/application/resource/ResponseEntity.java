package com.janwee.dddinaction.com.janwee.identityaccess.application.resource;

public class ResponseEntity<T> {
    private final T t;

    public ResponseEntity(T t) {
        this.t = t;
    }

    public static <T> ResponseEntity<T> noContent() {
        return null;
    }
}
