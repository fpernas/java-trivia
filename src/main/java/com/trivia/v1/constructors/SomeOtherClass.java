package src.main.java.com.trivia.v1.constructors;

/*
 * Open question: Is it possible to reuse the two-param constructor on the no-args one? How?
 *
 * Ans: on the no-args constructor I can call the 'this' constructor, like
 *      this("some-string-value", 0)
 */

public class SomeOtherClass {

    private String firstParam;
    private Integer secondParam;

    public SomeOtherClass() {
        this.firstParam = "some-string-value";
        this.secondParam = 0;
    }

    public SomeOtherClass(String a, Integer b) {
        this.firstParam = a;
        this.secondParam = b;
    }

}
