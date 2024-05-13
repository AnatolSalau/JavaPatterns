package structural.decorator.car_problem.modification;

import structural.decorator.car_problem.car.Car;

public class ColorLight extends CarModifications {
      public ColorLight(Car car) {
            super(car);
      }

      public void build() {
            car.build();
            addColoredLight();
      }

      private void addColoredLight() {
            System.out.println("Colored lights were add");
      }
}