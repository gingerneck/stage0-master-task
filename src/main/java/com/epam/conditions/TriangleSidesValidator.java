package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {

        var maxPointSide = firstSide;
        firstSide = 0;
        if (secondSide > maxPointSide) {
            firstSide = maxPointSide;
            maxPointSide = secondSide;
            secondSide = 0;
        }
        if (thirdSide > maxPointSide) {
            secondSide = maxPointSide;
            maxPointSide = thirdSide;
            thirdSide = 0;
        }

        if (maxPointSide < (firstSide + secondSide + thirdSide)) {
            System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }
    }
}
