package src.main.java.com.trivia.v1.interfaces.functional;

/*
 * Is any of the following a functional interface?
 *
 * The first one is a functional interface since it's defining
 * a single abstract method. The 'toString' method is overriden
 * from Object, and it's not taken into consideration for the definition
 * of a functional interface.
 *
 * The second one is not a functional interface. The method
 * 'equals' is almost the one of the Object class, except for
 * the parameter. The object class defines 'equals (Object obj)'
 */
public interface SomeInterface {

    boolean isObjectNotNull(Object obj);
    String toString();
}

public interface AnotherInterface {

    public int sumElements(int a, int b);
    boolean equals(Integer a);
}
