package OracleCollectionsExercises;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Exercise3 {
//    Write a method that takes a List<String> and applies String.trim to each element.
    public static void trimStrings(List<String> list) {
        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()) {
            lit.set(lit.next().trim());
        }
    }

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Colten     ");
        list.add("Mochi");
        System.out.printf("Before trimming: %s\n", list);
        trimStrings(list);
        System.out.printf("After trimming: %s\n", list);
    }
}
