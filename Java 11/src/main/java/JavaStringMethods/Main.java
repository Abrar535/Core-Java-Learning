package JavaStringMethods;

import java.util.stream.Collectors;

public class Main {
    public static void main(String args[]){
        //isBlank()
        System.out.println("Java11 isBlank():");
        System.out.println(" ".isBlank()); //true

        String s = "Abrar";
        System.out.println(s.isBlank()); //false
        String s1 = "  ";
        System.out.println(s1.isEmpty());//false
        System.out.println(s1.isBlank()); //true
        //lines()

        System.out.println("\nJava11 lines():");
        String str = "JD\nJD\nJD";
        System.out.println(str);
        System.out.println(str.lines().collect(Collectors.toList()));

        //strip()
        str =" JD ";
        System.out.println("\nJava11 strip():");
        System.out.print("Start");
        System.out.print(str.strip());
        System.out.println("End");

        System.out.print("Start");
        System.out.print(str.stripLeading());
        System.out.println("End");

        System.out.print("Start");
        System.out.print(str.stripTrailing());
        System.out.println("End");

        //Java11 repeat(int)
        System.out.println("\nJava11 repeat(int) : ");
        str = "=".repeat(3);
        System.out.println(str); //prints ===
    }
}
