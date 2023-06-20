package org.example;

public class Main {
    public static void main(String[] args) {
        Example someValue = new Example();
        someValue.displayInfo();
        System.out.println("~~~" + someValue.intValue + "~~~");
    }
}
class Example {
    int intValue = 10;
    Example(){
    }
    void displayInfo(){
        System.out.println("---" + intValue + "---");
    }
}