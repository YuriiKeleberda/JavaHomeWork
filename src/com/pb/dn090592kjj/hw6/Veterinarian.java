package com.pb.dn090592kjj.hw6;

public class Veterinarian {

    public void treatAnimal(Animal animal) {
        System.out.println("На приеме " + animal.getAnimalType());
        System.out.println("Еда: " + animal.getFood());
        System.out.println("Локация: "+ animal.getLocation());
        System.out.println("---------------------------------");
    }
}
