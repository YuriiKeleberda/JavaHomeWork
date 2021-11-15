package com.pb.dn090592kjj.hw7;

public abstract class Clothes {
     Size size;
     double price;
     String color;

     public Clothes(Size size, double price, String color) {
          this.size = size;
          this.price = price;
          this.color = color;
     }

     @Override
     public String toString() {
          return "Clothes{" +
                  "size=" + size +
                  ", price=" + price +
                  ", color='" + color + '\'' +
                  '}';
     }
}
