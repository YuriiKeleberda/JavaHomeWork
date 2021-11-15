package com.pb.dn090592kjj.hw7;

public class Tie extends Clothes implements ManClothes {

    public Tie(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println(this);
    }
}
