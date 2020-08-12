package JavStringMethods;

import java.util.Optional;

public class DescribeConstable {
    public static void main(String args[]){
        String so = "Hello";
        Optional os = so.describeConstable();
        System.out.println(os);
        System.out.println(os.get());

    }

}
