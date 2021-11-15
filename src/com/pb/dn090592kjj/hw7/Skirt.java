package com.pb.dn090592kjj.hw7;

public class Skirt extends Clothes implements WomenClothes {

    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println(this);
    }
}
