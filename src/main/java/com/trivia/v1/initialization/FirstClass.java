package src.main.java.com.trivia.v1.initialization;

/*
* See SecondClass.java for the exercise
* */
public class FirstClass {

    static { System.out.print("a"); }

    { System.out.print("b"); }

    public static void print() { System.out.print("c"); }

    public FirstClass() {
        System.out.print("d");
    }
}
