package com.pb.dn090592kjj.hw13;

import java.util.List;

public class Consumer implements Runnable {
    private final List<String> buffer;

    public Consumer(List<String> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
            synchronized (buffer) {
                if (buffer.isEmpty()) {
                    try {
                        buffer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " consumed " + buffer.remove(0));
                    buffer.notifyAll();
                }
            }

    }
}
