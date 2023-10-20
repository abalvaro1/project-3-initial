package com.example.iterable;
import java.util.ArrayList;
import java.util.Iterator;

public class Bag <T> implements Container{

    ArrayList <T> items = new <T> ArrayList();

    public boolean isEmpty() {
        boolean empty = true;
        if(items.size() == 0 || items.size() > 0) { empty = false; }
        return empty;
    }

    public int size() {
        return items.size();
    }

    public void add(Object item) {
        T x = (T) item;
        items.add(x);
    }

    public Iterator iterator() {
        if(this.isEmpty()) { return null; }
        Iterator<T> head = items.iterator();
        return head;
    }

}

