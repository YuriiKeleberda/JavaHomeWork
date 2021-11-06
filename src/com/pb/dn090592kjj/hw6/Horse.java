package com.pb.dn090592kjj.hw6;

import java.util.Objects;

public class Horse extends Animal {

    private String color;
    private String horseName;

    public Horse(String food, String location) {
        super(food, location);
        setAnimalType("Лошадь");
    }

    @Override
    public void makeNoise() {
        System.out.println("Иго-го!");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Horse)) return false;
        Horse horse = (Horse) o;
        return color.equals(horse.color) && horseName.equals(horse.horseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, horseName);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "color='" + color + '\'' +
                ", horseName='" + horseName + '\'' +
                '}';
    }
}
