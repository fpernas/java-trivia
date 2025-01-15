package src.main.java.com.trivia.v1.interfaces.inheritance;

/*
 * The class is inheriting from two interfaces with same default method.
 * When the constructor is called, which interface is being called?
 *
 * Ans: the code doesn't compile because the compiler doesn't know
 * which one of the interfaces to call. To solve this problem, is
 * necessary to override the conflicting method.
 */
public class ClassWithTwoInterfaces implements FirstInterface, SecondInterface {

    public ClassWithTwoInterfaces() {
        print();
    }

}
