package com.example.demo;

public interface Stack<T> {
    T peek();
    void push(T value);
    T pop();
}
