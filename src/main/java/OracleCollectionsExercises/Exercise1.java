package OracleCollectionsExercises;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class Exercise1 {
//    Write a program that prints its arguments in random order. Do not make a copy of the argument array. Demonstrate
//    how to print out the elements using both streams and the traditional enhanced for statement.

    public static void main(String[] args) {
        Collection<String> arguments = new LinkedList<>(Arrays.asList(args));
        //Streams approach
        arguments.stream().forEach(a -> System.out.println(a));

        //Enhanced for loop approach
        for (String arg : arguments) {
            System.out.println(arg);
        }
    }
}
