package com.example.cmput301lab1_petshop;

import java.util.Date;

public class Dog extends Pet implements Pettable{
    public Dog(String name) {
        super(name);
    }

    public Dog(String name, Date birthDate){
        super(name, birthDate);
    }

    // In Dog class
    @Override
    public String speak() {
        return "bark"; // Dogs bark
    }
}
