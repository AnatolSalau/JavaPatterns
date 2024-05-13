package behavior.strategy.boat_problem.boat;

import behavior.strategy.boat_problem.behavior.NoDiveBehaviour;

public class DinghyBoat extends Boat{

      public DinghyBoat() {
            super.diveable = new NoDiveBehaviour();
      }

      @Override
      void present() {
            System.out.println("This is DinghyBoat");
      }
}
