package com.example.iterable;

public class Bag <T> {
    private T t;

    public Bag(T t) {

        this.t = t;
    }

    public T getT() {
        return this.t;
    }

    public void set(T t) {
        this.t = t;}
    public T get() {
        return t;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bag{");
        sb.append("value=").append(t);
        sb.append('}');
        return sb.toString();
}

