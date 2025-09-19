package org.example;

class AudiFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}
