package org.apache.rocketmq.samples.springboot.domain;

import java.io.Serializable;

/**
 * genericEvent
 */

public class GenericEvent<T extends Serializable> implements Serializable {
    private String message;

    private T data;

    public GenericEvent() {
    }

    public GenericEvent(String message, T data) {
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }
}
