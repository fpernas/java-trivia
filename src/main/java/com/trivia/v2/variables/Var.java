package src.main.java.com.trivia.v2.variables;

/*
* Is there something wrong with this class?
*
* Ans: nothing. The class compiles with no problem. This is because:
* 1. Java is case sensitive, so naming a class "Var" it's not a problem
* 2. same with the String "var"
* 3. var is not considered a reserved word, so using var as a variable name or method is ok
* */

public class Var {

    public void var() {
        var var = "var";
    }

    public Var() {
        Var var = new Var();
    }

}
