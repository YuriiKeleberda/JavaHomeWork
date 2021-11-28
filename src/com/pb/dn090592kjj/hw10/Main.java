package com.pb.dn090592kjj.hw10;

public class Main {
    public static void main(String[] args) {
        NumBox<Float> floatNumBox = new NumBox<>(4);

        try {
            floatNumBox.add(12.2f);
            floatNumBox.add(10.1f);
            floatNumBox.add(2.2f);
            floatNumBox.add(2.0f);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("-----------Float Test--------------");
        System.out.println("Get element with 2 index: " + floatNumBox.get(2));
        System.out.println("Get length of the array: " + floatNumBox.length());
        System.out.println("Get average: " + floatNumBox.average());
        System.out.println("Get sum: " + floatNumBox.sum());
        System.out.println("Get max element: " + floatNumBox.max());


        NumBox<Integer> integerNumBox = new NumBox<>(4);

        try {
            integerNumBox.add(12);
            integerNumBox.add(10);
            integerNumBox.add(2);
            integerNumBox.add(1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("-----------Integer Test--------------");
        System.out.println("Get element with 2 index: " + integerNumBox.get(2));
        System.out.println("Get length of the array: " + integerNumBox.length());
        System.out.println("Get average: " + integerNumBox.average());
        System.out.println("Get sum: " + integerNumBox.sum());
        System.out.println("Get max element: " + integerNumBox.max());
    }
}
