package com.example.demo;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {

    @Test
    public void test(){

        SimpleStack<String> myStack = new SimpleStack<>(100);

        myStack.push("에디킴");
        myStack.push("아이린");
        myStack.push("테스트");

        Assert.assertEquals(3, myStack.size());
        Assert.assertEquals("테스트", myStack.peek());
        
        Assert.assertEquals("테스트", myStack.pop());
        Assert.assertNotEquals("테스트", myStack.peek());
        Assert.assertEquals(2, myStack.size());
        Assert.assertEquals("아이린", myStack.peek());

    }
}
