package com.pb.dn090592kjj.hw6;

import java.lang.reflect.Constructor;

public class VetClinic {
    public static void main(String[] args) throws Exception {
        Animal[] animals = new Animal[3];
        Cat cat = new Cat("Рыба", "Диван");
        Dog dog = new Dog("Кость", "Будка");
        Horse horse = new Horse("Овес", "Конюшня");
        animals[0] = cat;
        animals[1] = dog;
        animals[2] = horse;


        Class vetClass = Class.forName("com.pb.dn090592kjj.hw6.Veterinarian");
        Constructor constructor = vetClass.getConstructor();
        Veterinarian veterinarian = (Veterinarian) constructor.newInstance();

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}
