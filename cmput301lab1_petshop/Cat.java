package com.example.cmput301lab1_petshop;
import java.util.Date;

public class Cat extends Pet implements Pettable{
    public Cat(String name) {
        super(name);
    }

    public Cat(String name, Date birthDate){
        super(name, birthDate);
    }

    // In Cat class
    @Override
    public String speak() {
        return "meow"; // Cats meow
    }
}
