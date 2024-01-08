package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;
    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
    public String getDescription() {
        String fur = "";
        String paw = "";

        if (this.hasFur) {
            fur = "a";
        } else {
            fur = "no";
        }

        if (this.numberOfPaws==0 || this.numberOfPaws==1) {
            paw = "paw";
        }

        if (this.numberOfPaws>1) {
            paw = "paws";
        }

        return "This animal is mostly " +
                this.color + ". It has " +
                this.numberOfPaws + " " + paw + " and " + fur + " fur.";
    }
}
