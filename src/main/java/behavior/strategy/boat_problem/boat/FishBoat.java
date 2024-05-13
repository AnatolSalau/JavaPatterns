package behavior.strategy.boat_problem.boat;

import behavior.strategy.boat_problem.behavior.NoDiveBehaviour;

public class FishBoat extends Boat{

      public FishBoat() {
            super.diveable = new NoDiveBehaviour();
      }

      @Override
      void present() {
            System.out.println("This is FishBoat");
      }
}
