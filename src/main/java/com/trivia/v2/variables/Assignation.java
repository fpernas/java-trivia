package src.main.java.com.trivia.v2.variables;

/*
* Q: What does this code prints?
* A: firstValue: 4
     secondValue: 4
     thirdValue: false
     This is because in `var secondValue = (firstValue = 4)`, firstValue is given
     the value 4, and an assignation also returns its value, meaning that secondValue will
     have the value 4 as well. Then for thirdValue, the variable is initiated as `true`
     but its value it's changed to false on the `if` condition
* */

public class Assignation {

    public static void main(String[] args) {
        var firstValue = 0;
        var secondValue = (firstValue = 4);
        var thirdValue = (firstValue == 4);
        if (thirdValue = false) {
            System.out.println("It's false");
        }

        System.out.println("firstValue: " + firstValue);
        System.out.println("secondValue: " + secondValue);
        System.out.println("thirdValue: " + thirdValue);
    }

}
