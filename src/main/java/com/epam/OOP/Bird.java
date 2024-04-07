package com.epam.OOP;

public class Bird extends Animal {

    public Bird() {
        super("blue", 2, false);
    }

    @Override
    public String getDescription() {
        return String.format("%s %s", super.getDescription(),
                String.format("Moreover, it has %s wing%s and can fly.",
                        getNumberOfPaws(),
                        getNumberOfPaws() > 1 ? "s" : "")
        );
    }
}
