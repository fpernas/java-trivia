package src.main.java.com.trivia.v1.interfaces.inheritance;

public interface SecondInterface {

    default void print() {
        System.out.println("Value from second interface");
    }

}
