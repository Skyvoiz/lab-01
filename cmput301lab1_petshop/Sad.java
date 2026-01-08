package com.example.cmput301lab1_petshop;

import java.util.Date;

public class Sad extends Mood{

    public Sad() {
        super();
    }
    public Sad(Date moodDate) {
        super(moodDate);
    }
    @Override
    public String express() {
        return "sad";
    }
}
