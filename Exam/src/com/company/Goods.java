package com.company;

public class Goods {
    public static void main(String[] args) {
        int [] array = {100,200,300};
        GoodsDemo good1 = new GoodsDemo("Milk", 2, 100);
        System.out.println(good1.name+" "+good1.price+" euro(s) "+good1.weight+" gr ");
    }
}
