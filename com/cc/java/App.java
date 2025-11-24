package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // Instanziierung + Wertzuweisung
        Cat cat = new Cat("Grizabella", "white", 29);
        // output("Blick von aussen: " + cat);
        // output("Blick von innen: " + cat.getInstanceVariable());

        output(cat.getFirstName());
        output(cat.getFurColor());
        output(Integer.toString(cat.getAge()));  // Explizite Typumwandlung!

        output("-----------------------");

        Cat cat2 = new Cat("Alonzo", "grey", 35);
        // output("Blick von aussen: " + cat2);
        // output("Blick von innen: " + cat2.getInstanceVariable());

        output(cat2.getFirstName());
        output(cat2.getFurColor());
        output(Integer.toString(cat2.getAge()));  // Explizite Typumwandlung!

        output("-----------------------");
        cat2.setAge(36);
        output(Integer.toString(cat2.getAge()));  // Explizite Typumwandlung!


    }

  
    public static void output(String outputStr){
        System.out.println(outputStr);
    }


}

