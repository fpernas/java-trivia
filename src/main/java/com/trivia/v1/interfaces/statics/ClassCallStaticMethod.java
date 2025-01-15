package src.main.java.com.trivia.v1.interfaces.statics;

/*
 * What is the outcome of the code?
 *
 * Ans: since the method print is a static method, it
 * needs to be invoked like any static method, like
 * StaticMethodInterface.print(). It doesn't matter that the
 * method is inside an interface and the class implements said interface.
 *
 * Having said that, the code doesn't compile since 'print' is not
 * a defined method on the class
 */
public class ClassCallStaticMethod implements StaticMethodInterface {

    public static void main(String[] args) {
        print();
    }

}
