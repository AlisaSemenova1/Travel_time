package org.example;

public class Main {
    public static void main(String[] args) {
        final int homeToOfficeDistanceKm = 12;
        final float averageTaxiSpeed = 70;
        final float homeToOfficeTime = homeToOfficeDistanceKm / averageTaxiSpeed;
        final float eveningDecelerationRatio = 2;
        final float officeToHomeTime = homeToOfficeTime * eveningDecelerationRatio;
        System.out.println("переменная homeToOfficeDistanceKm " + homeToOfficeDistanceKm);
        System.out.println("переменная averageTaxiSpeed " + averageTaxiSpeed);
        System.out.println("переменная homeToOfficeTime " + homeToOfficeTime);
        System.out.println("переменная eveningDecelerationRatio " + eveningDecelerationRatio);
        System.out.println("переменная officeToHomeTime " + officeToHomeTime);
    }
}