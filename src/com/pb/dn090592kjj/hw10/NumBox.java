package com.pb.dn090592kjj.hw10;



public class NumBox<T extends Number> {

    private T[] arrayTs;

    public NumBox(int size) {
        this.arrayTs =  (T[]) new Number[size];
    }

    void add(T num) throws Exception {
        for (int i = 0; i < arrayTs.length; i++) {
            if(arrayTs[i] == null) {
                arrayTs[i] = num;
                break;
            }
            if (i == arrayTs.length - 1) {
                throw new Exception("The array is full.");
            }
        }
    }

    T get(int index) {
        if (index > arrayTs.length) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = 0; i < arrayTs.length; i++) {
            if(i == index) {
                return arrayTs[i];
            }
        }
        return null;
    }

    int length() {
        int elementsCount = 0;
        for (T arrayT : arrayTs) {
            if (arrayT != null) {
                elementsCount++;
            }
        }
        return elementsCount;
    }

    double average() {
        return sum()/length();
    }

    double sum() {
        double sum = 0;
        for (T arrayT : arrayTs) {
            if (arrayT != null) {
                sum += arrayT.doubleValue();
            }
        }
        return sum;
    }

    T max() {
        double previousValue = 0;
        T maxElement = null;

        for (int i = 0; i < arrayTs.length; i++) {
            if (i == 0) {
                maxElement = arrayTs[i];
                previousValue = arrayTs[i].doubleValue();
                continue;
            }
            if (arrayTs[i] != null) {
                if (arrayTs[i].doubleValue() > previousValue) {
                    maxElement = arrayTs[i];
                }
                previousValue = arrayTs[i].doubleValue();
            }
        }
        return maxElement;
    }

}
