package com.company;

public class Task5 {
    public static void main(String[] args) {
        boolean isTrue = true;
        int min = 0;
        int max = 100;
        int i = 0;
        while (isTrue){
            int num = (int) Math.round(Math.random() * (max-min)+min);
            System.out.println("Random is " + num);
            i++;
            if(i<50){
                isTrue=false;
            }
        }
    }
}
