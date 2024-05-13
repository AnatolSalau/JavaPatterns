package behavior.strategy.boat_problem.boat;

import behavior.strategy.boat_problem.behavior.Diveable;

public abstract class Boat {

      Diveable diveable;

      void sway() {
            System.out.println("Sway method run");
      }

      void roll() {
            System.out.println("Sway method run");
      }

      abstract void present();

      public void performDive() {
            diveable.dive();
      }
}
