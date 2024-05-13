package structural.decorator.car_problem.modification;

import structural.decorator.car_problem.car.Car;

abstract class CarModifications extends Car {
    Car car;

    public CarModifications(Car car) {
        this.car = car;
    }
}