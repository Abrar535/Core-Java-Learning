package LocalVariableSyntaxForLambaParams;

public class Main {

    public static void main(String args[]){

        LocalVariableSyntaxForLambaParamsInterface localVariableSyntaxForLambaParamsInterface = (var s1, var s2) -> s1 + s2;
        System.out.println(localVariableSyntaxForLambaParamsInterface.sum(3,4));
//        localVariableSyntaxForLambaParamsInterface = (var s1, int s2) -> s1 * s2; // no  mixing allowed in parameter.
//        var s1 -> s1 //not allowed. Need parentheses if using var in lambda. i.e should be used like this (var s1)-> s1;
        System.out.println(localVariableSyntaxForLambaParamsInterface.sum(3,4));
    }

}
