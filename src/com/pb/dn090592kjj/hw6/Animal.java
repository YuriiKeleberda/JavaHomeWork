package com.pb.dn090592kjj.hw6;

public class Animal {
    private String food;
    private String location;
    private String animalType;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void makeNoise() {
        System.out.println("Животное издает звук.");
    }

    public void eat() {
        System.out.println("Животное ест.");
    }

    public void sleep() {
        System.out.println("Животное спит.");
    }
}
