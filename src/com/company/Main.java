package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        List<Integer> list = new LinkedList<>();
        Random random = new Random();

        System.out.println("====create====");

        Date startTime = new Date();
        for (int i = 0; i < 100000; i++) {
            array.add(random.nextInt());
        }
        Date finishTime =  new Date();
        System.out.println("ArrayList: " + (finishTime.getTime() - startTime.getTime()) + " ms");

        startTime = new Date();
        for (int i = 0; i < 100000; i++) {
            list.add(random.nextInt());
        }
        finishTime = new Date();
        System.out.println("LinkedList: " + (finishTime.getTime() - startTime.getTime())+ " ms");

        System.out.println("====insert beginning====");

        startTime = new Date();
        for (int i = 0; i < 1000; i++) {
            array.add(0, random.nextInt());
        }
        finishTime = new Date();
        System.out.println("ArrayList: " + (finishTime.getTime() - startTime.getTime())+ " ms");

        startTime = new Date();
        for (int i = 0; i < 1000; i++) {
            list.add(0, random.nextInt());
        }
        finishTime = new Date();
        System.out.println("LinkedList: " + (finishTime.getTime() - startTime.getTime())+ " ms");

        System.out.println("====insert middle====");

        startTime = new Date();
        for (int i = 0; i < 1000; i++) {
            array.add(array.size()/2, random.nextInt());
        }
        finishTime = new Date();
        System.out.println("ArrayList: " + (finishTime.getTime() - startTime.getTime())+ " ms");

        startTime = new Date();
        for (int i = 0; i < 1000; i++) {
            list.add(list.size()/2, random.nextInt());
        }
        finishTime = new Date();
        System.out.println("LinkedList: " + (finishTime.getTime() - startTime.getTime())+ " ms");

        System.out.println("====insert end====");

        startTime = new Date();
        for (int i = 0; i < 1000; i++) {
            array.add(random.nextInt());
        }
        finishTime = new Date();
        System.out.println("ArrayList: " + (finishTime.getTime() - startTime.getTime())+ " ms");

        startTime = new Date();
        for (int i = 0; i < 1000; i++) {
            list.add(random.nextInt());
        }
        finishTime = new Date();
        System.out.println("LinkedList: " + (finishTime.getTime() - startTime.getTime())+ " ms");

        System.out.println("====update beginning====");

        startTime = new Date();
        for (int i = 0; i < 1000; i++) {
            array.set(i, random.nextInt());
        }
        finishTime = new Date();
        System.out.println("ArrayList: " + (finishTime.getTime() - startTime.getTime())+ " ms");

        startTime = new Date();
        for (int i = 0; i < 1000; i++) {
            list.set(i, random.nextInt());
        }
        finishTime = new Date();
        System.out.println("LinkedList: " + (finishTime.getTime() - startTime.getTime())+ " ms");

        System.out.println("====update middle====");

        startTime = new Date();
        for (int i = array.size()/2; i < 1000; i++) {
            array.set(i, random.nextInt());
        }
        finishTime = new Date();
        System.out.println("ArrayList: " + (finishTime.getTime() - startTime.getTime())+ " ms");

        startTime = new Date();
        for (int i = list.size()/2; i < 1000; i++) {
            list.set(i, random.nextInt());
        }
        finishTime = new Date();
        System.out.println("LinkedList: " + (finishTime.getTime() - startTime.getTime())+ " ms");

        System.out.println("====update end====");

        startTime = new Date();
        for (int i = array.size()-1000; i < array.size(); i++) {
            array.set(i, random.nextInt());
        }
        finishTime = new Date();
        System.out.println("ArrayList: " + (finishTime.getTime() - startTime.getTime())+ " ms");

        startTime = new Date();
        for (int i = list.size()-1000; i < list.size(); i++) {
            list.set(i, random.nextInt());
        }
        finishTime = new Date();
        System.out.println("LinkedList: " + (finishTime.getTime() - startTime.getTime())+ " ms");

        System.out.println("====delete beginning====");

        startTime = new Date();
        for (int i = 0; i < 1000; i++) {
            array.remove(0);
        }
        finishTime = new Date();
        System.out.println("ArrayList: " + (finishTime.getTime() - startTime.getTime())+ " ms");

        startTime = new Date();
        for (int i = 0; i < 1000; i++) {
            list.remove(0);
        }
        finishTime = new Date();
        System.out.println("LinkedList: " + (finishTime.getTime() - startTime.getTime())+ " ms");

        System.out.println("====delete middle====");

        startTime = new Date();
        for (int i = 0; i < 1000; i++) {
            array.remove((int)array.size()/2 + i);
        }
        finishTime = new Date();
        System.out.println("ArrayList: " + (finishTime.getTime() - startTime.getTime())+ " ms");

        startTime = new Date();
        for (int i = 0; i < 1000; i++) {
            list.remove((int)list.size()/2 + i);
        }
        finishTime = new Date();
        System.out.println("LinkedList: " + (finishTime.getTime() - startTime.getTime())+ " ms");

        System.out.println("====delete end====");

        startTime = new Date();
        for (int i = 0; i < 1000; i++) {
            array.remove(array.size()-1);
        }
        finishTime = new Date();
        System.out.println("ArrayList: " + (finishTime.getTime() - startTime.getTime())+ " ms");

        startTime = new Date();
        for (int i = 0; i < 1000; i++) {
            list.remove(list.size()-1);
        }
        finishTime = new Date();
        System.out.println("LinkedList: " + (finishTime.getTime() - startTime.getTime())+ " ms");
    }
}
