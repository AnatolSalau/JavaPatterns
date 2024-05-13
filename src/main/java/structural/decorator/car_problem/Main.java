package structural.decorator.car_problem;

import structural.decorator.car_problem.car.Audi;
import structural.decorator.car_problem.car.Car;
import structural.decorator.car_problem.modification.Nitrous;
import structural.decorator.car_problem.modification.Spoiler;

public class Main {
      public static void main(String[] args) {
            Car audi = new Audi();
            Car audiWithSpoiler = new Spoiler(audi);
            audiWithSpoiler.build();

            Car audiWithMods = new Nitrous(audiWithSpoiler);
            audiWithMods.build();
      }
}
