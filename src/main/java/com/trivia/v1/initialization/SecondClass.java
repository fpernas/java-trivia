package src.main.java.com.trivia.v1.initialization;

/*
 * What's the expected outcome?
 *
 * Ans: The response is:
 * a1bd2
 * bd2
 *
 * The first process that runs is 'class initialization'. When SecondClass class initializes,
 * since it's a child class of FirstClass, said class will initialize first. On class
 * initialization, first the static initializers are run, printing 'a'. Then the static
 * initializer of SecondClass runs, printing '1' (all static properties are initialize in
 * order, and since there are any, none it's initialized). Then comes the 'instance initialization'
 * process. First all instance initializators are run, printing 'b', then the used constructors,
 * printing 'd'. For SecondClass class, the no-args constructor is initialized, printing '2'.
 * Up to that moment we have a1bd2.
 *
 * Then prints an empty line, and finally prints bd2, since classes don't initialize anymore.
 */
public class SecondClass extends FirstClass {

    static { System.out.print("1"); }

    public SecondClass() {
        System.out.print("2");
    }

    public static void main(String[] args) {
        new SecondClass();
        System.out.println("");
        new SecondClass();
    }
}
