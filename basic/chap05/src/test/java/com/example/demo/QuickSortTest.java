package com.example.demo;

import org.junit.Test;

public class QuickSortTest {


    @Test
    public void test(){

        int data[] = {66, 10, 1, 34, 5, -10};

        Quick quick = new Quick();
        quick.sort(data, 0, data.length - 1);
        for(int i=0; i<data.length; i++){
            System.out.println("data["+i+"] : "+data[i]);
        }
    }

}
