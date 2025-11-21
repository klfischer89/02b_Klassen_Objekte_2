package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Cat cat = new Cat();
        output("Blick von aussen: " + cat);
        output("Blick von innen: " + cat.getInstanceVariable());

        output("-----------------------");

        Cat cat2 = new Cat();
        output("Blick von aussen: " + cat2);
        output("Blick von innen: " + cat2.getInstanceVariable());

    }

  
    public static void output(String outputStr){
        System.out.println(outputStr);
    }


}

