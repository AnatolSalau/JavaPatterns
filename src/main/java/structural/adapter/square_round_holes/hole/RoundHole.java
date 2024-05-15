package structural.adapter.square_round_holes.hole;

import structural.adapter.square_round_holes.peg.RoundPeg;

/**
 * КруглоеОтверстие совместимо с КруглымиКолышками.
 */
public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = radius >= peg.getRadius();
        return result;
    }
}