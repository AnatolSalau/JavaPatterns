package behavior.strategy.boat_problem.behavior;

public class NoDiveBehaviour implements Diveable {
    public void dive() {
        System.out.println("This boat can't dive");
    }
}