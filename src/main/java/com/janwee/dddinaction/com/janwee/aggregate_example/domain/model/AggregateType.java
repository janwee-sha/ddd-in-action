package com.janwee.dddinaction.com.janwee.aggregate_example.domain.model;

//不变条件：c=a+b
public class AggregateType {
    private int a;
    private int b;
    private int c;

    public AggregateType(int a, int b) {
        this.a = a;
        this.b = b;
        this.c = a + b;
    }

    public void increaseA(int amount) {
        this.a += amount;
        this.c += amount;
    }

    public void increaseB(int amount) {
        this.b += amount;
        this.c += amount;
    }
}
