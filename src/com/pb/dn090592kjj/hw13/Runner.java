package com.pb.dn090592kjj.hw13;

import java.util.LinkedList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<String> buffer = new LinkedList<>();

        Thread producerThread = new Thread(new Producer(buffer));
        producerThread.setName("producerThread");

        Thread consumerThread1 = new Thread(new Consumer(buffer));
        consumerThread1.setName("consumerThread1");

        //Thread consumerThread2 = new Thread(new Consumer(buffer));
        //consumerThread2.setName("consumerThread2");

        producerThread.start();
        consumerThread1.start();
        //consumerThread2.start();
    }
}
