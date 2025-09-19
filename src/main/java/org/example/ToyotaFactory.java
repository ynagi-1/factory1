package org.example;

class ToyotaFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new Toyota();
    }
}
