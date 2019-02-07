package com.example.demo;

import org.junit.Assert;
import org.junit.Test;

public class SeqSearchTest {

    @Test
    public void test(){

        int[] a = new int[6];
        a[0] = 22;
        a[1] = 11;
        a[2] = 7;
        a[3] = 9;
        a[4] = 27;
        a[5] = 17;

        Assert.assertEquals(seqSearchByWhile(a, 6, 9), 3);
        Assert.assertEquals(seqSearchByWhile(a, 6, 22), 0);
        Assert.assertEquals(seqSearchByWhile(a, 6, 77), -1);

        Assert.assertEquals(seqSearchByFor(a, 6, 9), 3);
        Assert.assertEquals(seqSearchByFor(a, 6, 22), 0);
        Assert.assertEquals(seqSearchByFor(a, 6, 77), -1);

    }

    //요솟수가 n인 배열 a 에서 key 와 같은 요소를 선형 검색
    static int seqSearchByWhile(int[] a, int n, int key){
        int i = 0;

        while(true){
            if(i == n){
                return -1;
            }
            if(a[i] == key){
                return i;
            }
            i++;
        }
    }

    static int seqSearchByFor(int[] a, int n, int key){

        for(int i = 0; i < n; i++){
            if(a[i] == key){
                return i;
            }
        }
        return -1;
    }
}
