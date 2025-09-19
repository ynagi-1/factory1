package org.example;

public class CarDriving {
    public static void main(String[] args) {
        CarFactory factory;

        factory = new ToyotaFactory();
        factory.testDrive();

        factory = new AudiFactory();
        factory.testDrive();
    }
}