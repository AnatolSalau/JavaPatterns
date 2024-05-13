package structural.decorator.car_problem.modification;

import structural.decorator.car_problem.car.Car;

public class Spoiler extends CarModifications {
      public Spoiler(Car car) {
            super(car);
      }

      public void build() {
            car.build();
            addSpoiler();
      }

      private void addSpoiler() {
            System.out.println("Spoiler built");
      }
}