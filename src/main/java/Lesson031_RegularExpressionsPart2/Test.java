package Lesson031_RegularExpressionsPart2;


import java.util.Arrays;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

public class Test {
    public static void main(String[] args) {
        String a = "Hello there hey";
        String[] words = a.split(" ");
        System.out.println(Arrays.toString(words));

        String b = "Hello there hey";
        String  modifiedString = b.replace(" ", ".");
        System.out.println(modifiedString);

        String c = "Hello5861there68498494hey";
        String  modString = c.replaceAll("\\d+", "-");
        String modString2 = c.replaceFirst("\\d+", "-");
        System.out.println(modString);
        System.out.println(modString2);



    }
}