package com.janwee.dddinaction.com.janwee.event.domain;

public class DomainEventPublisher {
    public static DomainEventPublisher instance() {
        return new DomainEventPublisher();
    }

    public void publish(DomainEvent event) {
        System.out.println(event.description());
    }
}
