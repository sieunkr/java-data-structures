package com.example.demo;

public class CircularQueue<E> implements Queue<E> {

    private int max;                //큐 용량
    private int front;              //첫 번째
    private int rear;               //마지막
    private int num;                //현재 개수
    private E[] queue;              //큐

    public CircularQueue(int max){
        this.num = 0;
        this.front = 0;
        this.rear = 0;
        this.max = max;

        this.queue = (E[]) new Object[max];
    }

    @Override
    public void insert(E item) {
        if(num >= max){
            //TODO:큐 가득참

        }

        queue[rear++] = item;
        num++;

        if(rear == max){
            rear = 0;
        }

    }

    @Override
    public E peek() {
        return queue[front];
    }

    @Override
    public E remove() {

        E item = peek();
        front++;

        num--;

        if(front == max){
            front = 0;
        }

        return item;
    }

    public void clear(){
        num = 0;
        front = 0;
        rear = 0;
    }

    public int size(){
        return num;
    }

    public boolean isEmpty(){
        return num <= 0;
    }

    public int getFront(){
        return front;
    }
}
