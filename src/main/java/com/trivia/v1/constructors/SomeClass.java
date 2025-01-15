package com.trivia.v1.constructors;

/*
 * Is there any problem with this code?
 *
 * Ans: Since SubClass doesn't implement any constructor,
 * it creates the default no-args constructor. For every
 * constructor, the compiler adds the super() call.
 * Since SomeClass doesn't implement the no-args default,
 * the super() call is not possible to be done,
 * hence the code doesn't compile
 *
 */

public class SomeClass {

    public SomeClass(String value) {
        System.out.println(value);
    }
}

public class SubClass extends SomeClass {

}
