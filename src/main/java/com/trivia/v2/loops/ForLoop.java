package src.main.java.com.trivia.v2.loops;

/*
* Q: What is the method outputting?
* A: Aabcdefghijklm
*       In case you didn't know, loops can have a label at the beginning, where said
*       label can be omitted. If used, you can reference to them, as here where the inner
*       loop is breaking with the outer one when a condition is met.
* */
public class ForLoop {

    public static void main(String[] args) {
        String someString = "";
        MAIN_FOR_LOOP: for (char upper = 'A'; upper <= 'Z'; upper++) {
            someString += upper;
            SECONDARY_FOR_LOOP: for (char lower = 'a'; lower <= 'z'; lower++) {
                someString += lower;
                if (lower == 'm') {
                    System.out.println(someString);
                    break MAIN_FOR_LOOP;
                }
            }
        }
    }

}
