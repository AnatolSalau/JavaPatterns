package behavior.strategy.boat_problem.boat;

import behavior.strategy.boat_problem.behavior.DiveBehaviour;

public class SubBoat extends Boat{

      public SubBoat() {
            super.diveable = new DiveBehaviour();
      }

      @Override
      void present() {
            System.out.println("This is SubBoat");
      }
}
