package creation.singleton;

public class ProbeSingleton {
      //The singleton class holds a reference to itself
      private static ProbeSingleton probe = null;

      //create private constructor
      private ProbeSingleton() {

      }
      //Create singleton class
      public static ProbeSingleton getInstance() {
            synchronized (ProbeSingleton.class) {
                  if (probe == null) {probe = new ProbeSingleton();}
            }
            return probe;
      }
}
