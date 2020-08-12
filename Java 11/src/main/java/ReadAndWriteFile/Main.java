package ReadAndWriteFile;

import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main (String args[]) throws Exception{

        Path path = Files.writeString(Files.createTempFile("test", ".txt"), "This was posted on JD");
        System.out.println(path);
        String s = Files.readString(path);
        System.out.println(s);
    }
}
