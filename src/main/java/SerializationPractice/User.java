package SerializationPractice;

import java.io.*;
import java.nio.file.Files;
import java.util.UUID;

//Objects must be serializable to read/write to memory, networks, and databases
public class User implements Serializable {
    //Won't get saved, static
    static int userCount = 0;

    @Serial
    private static final long serialVersionUID = 1L;
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Write User object
        FileOutputStream fos = new FileOutputStream("test.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new User("colllten", "password"));
        oos.close();
        fos.close();

        //Read the User object from test.bin
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.bin"));
        User user = (User) ois.readObject();
        System.out.println(user);

        ois.close();
    }
}
