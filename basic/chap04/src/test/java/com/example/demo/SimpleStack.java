package com.example.demo;

public class SimpleStack<T> implements Stack<T> {

    private int max;
    private int stackPointer;
    private Object[] stack;

    public SimpleStack(int size){
        stackPointer = 0;
        stack = new Object[size];
        max = size;
    }

    @Override
    public T peek() {
        if(stackPointer <= 0){
            //TODO:스택이 비어있음
        }
        return (T)stack[stackPointer - 1];
    }

    @Override
    public void push(T value) {

        if(stackPointer >= max){
            //TODO:스택이 만땅
        }
        stack[stackPointer++] = value;
    }

    @Override
    public T pop() {
        T obj;
        obj = peek();

        --stackPointer;
        return obj;
    }

    public void clear(){
        stackPointer = 0;
    }

    public int size() {
        return stackPointer;
    }
}
