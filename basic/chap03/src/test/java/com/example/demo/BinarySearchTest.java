package com.example.demo;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BinarySearchTest {

    @Test
    public void test(){

        //오름차순
        /*
        int[] arr = new int[7];
        arr[0] = 1;
        arr[1] = 5;
        arr[2] = 7;
        arr[3] = 9;
        arr[4] = 40;
        arr[5] = 55;
        arr[6] = 77;
        */
        int[] arr = { 1, 5, 7, 9, 40, 55, 77 };

        Assert.assertEquals(0, binarySearch(arr, 7, 1));
        Assert.assertEquals(3, binarySearch(arr, 7, 9));
        Assert.assertEquals(5, binarySearch(arr, 7, 55));
        Assert.assertEquals(6, binarySearch(arr, 7, 77));
        Assert.assertEquals(-1, binarySearch(arr, 7, 99));


        //Arrays.binarySearch
        Assert.assertEquals(6, Arrays.binarySearch(arr, 77));
        Assert.assertNotEquals(-1, Arrays.binarySearch(arr, 99));
    }

    static int binarySearch(int[] arr, int n, int key){
        int middle;                     //가운데 인덱스
        int left = 0;                   //첫 인덱스
        int right = n - 1;              //끝 인덱스

        while(right >= left){

            middle = (right + left) / 2;

            if(key == arr[middle]){
                return middle;          //검색 성공
            }
            else if(arr[middle] < key){
                left = middle + 1;
            }
            else{
                right = middle - 1;
            }
        }
        return -1;                      //검색실패
    }

}
