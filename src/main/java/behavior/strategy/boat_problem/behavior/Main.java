package behavior.strategy.boat_problem.behavior;

import behavior.strategy.boat_problem.boat.Boat;
import behavior.strategy.boat_problem.boat.FishBoat;
import behavior.strategy.boat_problem.boat.SubBoat;

public class Main {
      public static void main(String[] args) {
            Boat fishBoat = new FishBoat();
            fishBoat.performDive();

            Boat subBoat = new SubBoat();
            subBoat.performDive();
      }

}
