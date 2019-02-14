package com.example.demo;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


public class QueueTest {

    @Test
    public void test_custom_circularQueue(){

        CircularQueue<String> circularQueue = new CircularQueue<>(6);

        circularQueue.insert("에디킴");
        circularQueue.insert("아이린");
        circularQueue.insert("아이유");

        Assert.assertEquals(3, circularQueue.size());
        Assert.assertEquals("에디킴", circularQueue.peek());

        Assert.assertEquals("에디킴", circularQueue.remove());
        Assert.assertEquals(2, circularQueue.size());
        Assert.assertEquals(1, circularQueue.getFront());

        //TODO:... 테스트 코드 추가
    }

    @Test
    public void test_blockingQueue(){

        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(10);

        blockingQueue.add("에디킴");
        blockingQueue.add("아이린");
        blockingQueue.add("아이유");

        Assert.assertEquals(3,blockingQueue.size());
        Assert.assertEquals("에디킴", blockingQueue.peek());
        Assert.assertEquals("에디킴", blockingQueue.remove());

        Assert.assertEquals(2, blockingQueue.size());

        //TODO:...

        
    }

}
