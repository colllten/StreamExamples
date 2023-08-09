package PathPractice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FirstExample {
    public static void main(String[] args) throws IOException {
        //Create path to file
        Path path = Path.of("/Users/coltenglover/Desktop/textFile.txt");
        System.out.printf("First path: %s\n", path);

        //Getting the owner of a file
        System.out.printf("Owner of this path: %s\n", Files.getOwner(path));

        //Creating files:
        path = Files.createFile(Path.of("/Users/coltenglover/Desktop/fromJava.txt"));
        System.out.printf("Created file: %s\n", path);
        //Writing to this file
        String s = "This is being written from Java\nThis is a newline";
        Files.writeString(path, s);
        System.out.printf("Wrote: \"%s\" to %s\n", s, path.getFileName());
        //Read from that file
        List<String> list = Files.readAllLines(path);
        System.out.printf("Reading from %s\n", path.getFileName());
        list.forEach(System.out::println);
        System.out.println("File reading complete!");
    }
}
