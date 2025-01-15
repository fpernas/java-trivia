package src.main.java.com.trivia.v2.overload;

import java.util.List;

/*
* Q: Is this class ok? Is there anything wrong with the overloaded methods?
* A: The first two are just fine, since they follow the idea of overloading. But with the
*       `printList` ones, when the class is compiled, Java removes the parameter for the list,
*       having something like `printList(List a)`. This causes that when compiled, those methods
*       are the same, making impossible for Java to know which is which
* */

public class OverloadedClass {

    public void printParam(int a) { System.out.println(a); }
    public void printParam(char a) { System.out.println(a); }
    public void printList(List<Integer> a) { System.out.println(a); }
    public void printList(List<String> a) {
        for (String str : a) System.out.println(str);
    }

}
