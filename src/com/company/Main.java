package com.company;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Asan", "programmer", "Java company");
        System.out.println(programmer);
        programmer.coding();
        programmer.eat();
        programmer.learn();
        programmer.walk();
        System.out.println();
        Dancer dancer = new Dancer("Murat", "dancer", "Delbirim dance-group");
        System.out.println(dancer);
        dancer.eat();
        dancer.walk();
        dancer.dancing();
        dancer.learn();
        System.out.println();
        Singer singer = new Singer("Ali", "singer", "LIGHT");
        System.out.println(singer);
        singer.learn();
        singer.walk();
        singer.singing();
        singer.playGitar();
        singer.eat();
    }
}