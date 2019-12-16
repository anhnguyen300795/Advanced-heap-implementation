package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        FibonacciHeap<Integer> fibHeap = new FibonacciHeap<>();
//
//        fibHeap.add(4);
//        fibHeap.add(6);
//        fibHeap.add(1);
//
//        System.out.println(fibHeap.extractMin());
//
//
//        fibHeap.add(8);
//        fibHeap.add(9);
//        fibHeap.add(99);
//        fibHeap.add(10);
//        fibHeap.add(3);
//        fibHeap.add(1);
//
//        fibHeap.add(5);
//
//        System.out.println(fibHeap.extractMin());
//        fibHeap.decreaseKey(5, 2);
//
//        fibHeap.decreaseKey(10, 7);
//        fibHeap.decreaseKey(9, 5);
//
//        fibHeap.decreaseKey(4, 1);
//        fibHeap.decreaseKey(8, 4);
//        fibHeap.add(9);
////
//        while (!fibHeap.isEmpty()) {
//            System.out.println("result " + fibHeap.extractMin());
//        }
        //FibonacciHeap.Node x = ;
        //fibHeap.decreaseKey(3, 1);

        testDecreaseKey();


        //System.out.println("hello world" + x.key);
	// write your code here
    }

    public static void testDecreaseKey() {
        Random random = new Random();
        FibonacciHeap<Integer> fibHeap = new FibonacciHeap<>();
        int[] array = random.ints(2000, 20,2000).toArray();
        for (int e: array) {
            fibHeap.add(e);
        }

        fibHeap.add(fibHeap.extractMin());
        System.out.println("original array " + Arrays.toString(array));

        for (int i = 0; i < 300; i++) {
            Random rand = new Random();
            int index = rand.nextInt(2000);
            int oldValue = array[index];
            array[index] -= rand.nextInt(100000);
            fibHeap.decreaseKey(oldValue, array[index]);
        }

        Arrays.sort(array);

        int count = 0;

        System.out.println("sort array " + Arrays.toString(array));

        while (!fibHeap.isEmpty()) {
            int curValue = fibHeap.extractMin();
            //System.out.println(curValue + " " + array[count]);
            if (curValue != array[count]) {
                System.out.println(fibHeap.findCount(curValue).size());
                System.out.println("this is bulsshit " + curValue + " " + array[count]);
            }
            count++;
        }

        System.out.println(count +" "+ array.length);

    }
}
