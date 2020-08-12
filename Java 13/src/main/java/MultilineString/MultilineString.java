package MultilineString;

public class MultilineString {


    /**
     * JEP 355: Preview Feature (only for java 13)
     */
    @SuppressWarnings("preview")
    public static void main(String[] args) {
        String textBlock = """
				Hi
				Hello
				Yes""";

        String str = "Hi\nHello\nYes";

        System.out.println("Text Block String:\n" + textBlock);
        System.out.println("Normal String Literal:\n" + str);

        System.out.println("Text Block and String Literal equals() Comparison: " + (textBlock.equals(str)));
        System.out.println("Text Block and String Literal == Comparison: " + (textBlock == str));
    }
}
