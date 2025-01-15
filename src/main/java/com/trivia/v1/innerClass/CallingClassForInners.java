package src.main.java.com.trivia.v1.innerClass;

import src.main.java.com.trivia.v1.innerClass.InnerClass.MoreInnerClass.MostInnerClass;

/*
 * How can I do to print the text in the most inner class?
 * How can I do it importing the least amount of classes (don't use var)?
 *
 * Ans: I cannot call 'new MostInnerClass()' since it's an inner class.
 * I can't even call 'new MoreInnerClass()' since it's also an inner class.
 * Those inner classes are tied to an instance of 'InnerClass' class.
 * Because of that I need first an instance of 'InnerClass':
 *          var innerClass = new InnerClass();
 * Now I can instance 'MoreInnerClass':
 *          var moreInnerClass = innerClass.new MoreInnerClass()
 * And with that instance, I can finally get an instance of 'MostInnerClass':
 *          var mostInnerClass = moreInnerClass.new MostInnerClass()
 * And to use the least amount of imports, I can use this code:
 *          InnerClass innerClass = new InnerClass();
 *          InnerClass.MoreInnerClass moreInnerClass = innerClass.new MoreInnerClass();
 *          InnerClass.MoreInnerClass.MostInnerClass mostInnerClass = moreInnerClass.new MostInnerClass();
 */
public class CallingClassForInners {

    public static void main(String[] args) {

        new MostInnerClass();
    }

}
