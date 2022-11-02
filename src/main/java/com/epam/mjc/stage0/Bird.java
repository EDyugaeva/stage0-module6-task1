package com.epam.mjc.stage0;

public class Bird extends Animal {

    public Bird() {
        super.setColor("blue");
        super.setNumberOfPaws(2);
        super.setHasFur(false);
    }

    @Override
    public String getDescription() {
        String superString = super.getDescription();
        return superString + " Moreover, it has 2 wings and can fly.";
    }


}
