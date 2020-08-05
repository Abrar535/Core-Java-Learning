package JavStringMethods;

public class Indent {
    public static void main(String args[]){
        String str = "*****\n  Hi\n  \tHello Abrar\rHow are you?\n*****";

        System.out.println(str.indent(0));
        System.out.println(str.indent(3));
        System.out.println(str.indent(-3));
    }
}
