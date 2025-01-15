package src.main.java.com.trivia.v1.lambdas;

/*
 * Which one of the following is a correct lambda definition?
 * Note that they are all independent between each other.
 *
 * Ans: all of them are invalid. None of them even compiles
 */

public class Lambdas {

    Predicate<String> p1 = String a -> a.equals("true");
    Predicate<String> p2 = var b -> b.equals("false");
    BiPredicate<String, String> p3 = (var a, b) -> a.equals(b);
    BiPredicate<Integer, Integer> p4 = (a, b) -> {var sum = a + b; var gtz = sum > 0 ;};
    BiPredicate<String, Object> p5 = (String a, var b) -> b instanceof String;


}
