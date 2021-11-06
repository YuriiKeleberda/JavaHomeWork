package com.pb.dn090592kjj.hw6;

import java.util.Objects;

public class Dog extends Animal {

    private double weight;
    private String dogName;

    public Dog(String food, String location) {
        super(food, location);
        setAnimalType("Собака");
    }

    @Override
    public void makeNoise() {
        System.out.println("Гав!");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return Double.compare(dog.weight, weight) == 0 && dogName.equals(dog.dogName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, dogName);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + weight +
                ", dogName='" + dogName + '\'' +
                '}';
    }
}
