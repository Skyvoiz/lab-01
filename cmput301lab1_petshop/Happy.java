package com.example.cmput301lab1_petshop;

import java.util.Date;

public class Happy extends Mood{

    public Happy() {
        super();
    }
    public Happy(Date moodDate) {
        super(moodDate);
    }
    @Override
    public String express() {
        return "happy";
    }
}
