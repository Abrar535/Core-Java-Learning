package main.FunctionalInterfacesAndLambdaExpression;


import main.Java8DefaultAndStaticInterfaces.Interface1;

public class Main {
    public static void main(String[] args){
        Runnable r1 = () -> {
            System.out.println("My Runnable");
        };
        Interface1 i1 = (s) -> System.out.println(s);
        i1.method1("abc");
        r1.run();
    }

}
