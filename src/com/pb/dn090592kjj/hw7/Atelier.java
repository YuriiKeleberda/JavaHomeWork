package com.pb.dn090592kjj.hw7;

public class Atelier {
    public static void main(String[] args) {

        Clothes [] clothes = new Clothes[4];
        clothes[0] = new Tshirt(Size.S, 100, "Red");
        clothes[1] = new Pants(Size.XXS, 110, "Blue");
        clothes[2] = new Skirt(Size.M, 120, "Black");
        clothes[3] = new Tie(Size.L, 130, "Green");

        dressMan(clothes);
        dressWomen(clothes);

    }

    public static void dressMan(Clothes[] clothes) {
        System.out.println("Clothes for man: ");
        for (Clothes c : clothes) {
            if (c instanceof ManClothes) {
                ((ManClothes) c).dressMan();
            }
        }
    }

    public static void dressWomen(Clothes[] clothes) {
        System.out.println("Clothes for women: ");
        for (Clothes c : clothes) {
            if (c instanceof WomenClothes) {
                ((WomenClothes) c).dressWomen();
            }
        }
    }
}
