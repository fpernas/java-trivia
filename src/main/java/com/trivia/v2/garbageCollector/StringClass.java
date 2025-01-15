package src.main.java.com.trivia.v2.garbageCollector;

/*
* Q: How does this two String creation methods work with the Garbage Collector?
* A: When chars are being appended to the string variable, and because String is immutable,
*       a new String is assigned to `stringVar` each time. This means that each string before
*       appending a new char is eligible for garbage collection:
*           * in the first step, "" is eligible
*           * in the second step, "a" is eligible
*           * in the third step, "ab" is eligible
*       und so weiter.
*       This proves to not be so efficient, because objects are disposed very quickly. But we can
*       improve that using StringBuilder, where no Strings are immediate put for the garbage collector
*       to collect them, because this object is mutable.
*
* */

public class StringClass {

    public StringClass() {
        String stringVar = "";
        StringBuilder stringBuilder = new StringBuilder();
        for (char letter = 'a'; letter <= 'z'; letter++) {
            stringVar += letter;
            stringBuilder.append(letter);
        }

        System.out.println(stringVar);
        System.out.println(stringBuilder.toString());



    }

}
