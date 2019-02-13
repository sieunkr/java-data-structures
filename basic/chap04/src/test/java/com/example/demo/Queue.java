package com.example.demo;

public interface Queue<E> {
    void insert(E item);
    E peek();
    E remove();
}
