package structural.decorator.car_problem.modification;

import structural.decorator.car_problem.car.Car;

public class Nitrous extends CarModifications {
      public Nitrous(Car car) {
            super(car);
      }

      public void build() {
            car.build();
            addNitro();
      }

      private void addNitro() {
            System.out.println("Nitro was added");
      }
}