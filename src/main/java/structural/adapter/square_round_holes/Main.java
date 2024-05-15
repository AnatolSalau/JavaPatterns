package structural.adapter.square_round_holes;

import structural.adapter.square_round_holes.adapter.SquarePegAdapter;
import structural.adapter.square_round_holes.hole.RoundHole;
import structural.adapter.square_round_holes.peg.RoundPeg;
import structural.adapter.square_round_holes.peg.SquarePeg;

public class Main {
      public static void main(String[] args) {
            // Круглое к круглому — всё работает.
            RoundHole hole = new RoundHole(5);
            RoundPeg rpeg = new RoundPeg(5);
            if (hole.fits(rpeg)) {
                  System.out.println("Round peg r5 fits round hole r5.");
            }

            SquarePeg smallSqPeg = new SquarePeg(2);
            SquarePeg largeSqPeg = new SquarePeg(20);
            // hole.fits(smallSqPeg); // Не скомпилируется.

            // Адаптер решит проблему.
            SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
            SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
            if (hole.fits(smallSqPegAdapter)) {
                  System.out.println("Square peg w2 fits round hole r5.");
            }
            if (!hole.fits(largeSqPegAdapter)) {
                  System.out.println("Square peg w20 does not fit into round hole r5.");
            }
      }
}
