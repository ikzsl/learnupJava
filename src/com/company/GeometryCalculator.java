package com.company;

public class GeometryCalculator {
    public static StringBuilder triangleCalculator(int sideA, int sideB, int sideC) {
        double angleA = Math.acos((Math.pow(sideB, 2) + Math.pow(sideC, 2) - Math.pow(sideA, 2)) / (2 * sideB * sideC));
        double angleB = Math.acos((Math.pow(sideA, 2) + Math.pow(sideC, 2) - Math.pow(sideB, 2)) / (2 * sideA * sideC));
        double angleC = Math.PI - (angleA + angleB);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("angle A - " + angleA + "rad" + "\n");
        stringBuilder.append("angle B - " + angleB + "rad" + "\n");
        stringBuilder.append("angle C - " + angleC + "rad" + "\n");
        return stringBuilder;
    }
}
