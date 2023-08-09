package OracleCollectionsExercises;

import java.util.*;

public class Exercise3 {
//    Write a method that takes a List<String> and applies String.trim to each element.
    public static void trimStrings(List<String> list) {
        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()) {
            lit.set(lit.next().trim());
        }
    }

    public static void main(String[] args) {
        String s = "   Fly me   to the moon   ";
        System.out.println(Arrays.toString(s.trim().split(" ")));
    }
}
