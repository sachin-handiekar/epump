package com.kodewerk.epump.test;


import com.kodewerk.epump.Event;

public class ThrowsDivideByZeroQuery extends Query {

    private int sum = 0;

    public void processEvent(IntegerEvent event) {
        sum += event.getValue() / sum;
    }

    @Override
    public void accept(Event event) {
        event.writeTo(this);
    }

    public String toString() {
        return Integer.toString( sum);
    }
}
