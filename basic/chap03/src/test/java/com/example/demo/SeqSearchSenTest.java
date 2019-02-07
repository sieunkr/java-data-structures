package com.example.demo;

import org.junit.Assert;
import org.junit.Test;

public class SeqSearchSenTest {

    @Test
    public void test(){

        int[] a = new int[6 + 1];
        a[0] = 22;
        a[1] = 11;
        a[2] = 7;
        a[3] = 9;
        a[4] = 27;
        a[5] = 17;

        Assert.assertEquals(seqSearchSentinel(a, 6, 9), 3);
        Assert.assertEquals(seqSearchSentinel(a, 6, 22), 0);
        Assert.assertEquals(seqSearchSentinel(a, 6, 77), -1);

    }

    static int seqSearchSentinel(int[] a, int n, int key){

        a[n] = key;
        int i = 0;

        while(true){
            if(a[i] == key){
                break;
            }
            i++;
        }
        return i == n ? -1 : i;
    }

}
