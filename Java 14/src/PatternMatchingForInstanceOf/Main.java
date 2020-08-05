package PatternMatchingForInstanceOf;



public class Main {

    public static void main(String args[]) {
        ChildClass ob =  new ChildClass();
        if(ob instanceof ParentClass){
            System.out.println(true);
        }
        System.out.println(ob.name());
    }



}
