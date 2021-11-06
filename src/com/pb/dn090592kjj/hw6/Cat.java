package com.pb.dn090592kjj.hw6;

import java.util.Objects;

public class Cat extends Animal {

    private int numberOfLives;
    private String catName;

    public Cat(String food, String location) {
        super(food, location);
        setAnimalType("Кот");
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяу!");
    }

    @Override
    public void eat() {
        System.out.println("Кот ест.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        Cat cat = (Cat) o;
        return numberOfLives == cat.numberOfLives && catName.equals(cat.catName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfLives, catName);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "numberOfLives=" + numberOfLives +
                ", catName='" + catName + '\'' +
                '}';
    }
}
