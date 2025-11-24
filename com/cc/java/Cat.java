package com.cc.java;

public class Cat {

    // Eigenschaften / Felder / Attribute
    private String firstName;
    private String furColor;
    private int age;

    public Cat(String firstName, String furColor, int age) {
        this.firstName = firstName;
        this.furColor = furColor;
        this.age = age;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getFurColor() {
        return furColor;
    }

    public int getAge() {
        return age;
    }

    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }


    public void setAge(int age) {
        this.age = age;
    }


    // return der Instanzvariablen / Adresse
    public Cat getInstanceVariable(){
       return this;
    }

}
