package com.pb.dn090592kjj.hw13;

import java.util.List;

public class Producer implements Runnable {
    private final List<String> buffer;
    private static final int BUFFER_SIZE = 5;

    public Producer(List<String> buffer) {
        this.buffer = buffer;
    }


    @Override
    public void run() {
        String[] names = {"Java", "C++", "C#"};
        for (String name : names) {
            if (buffer.size() >= BUFFER_SIZE) {
                try {
                    buffer.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                synchronized (buffer) {
                    buffer.add(name);
                    buffer.notifyAll();
                }
            }
        }
    }
}
