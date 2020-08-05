package JavStringMethods;

import java.util.Arrays;
import java.util.List;

public class Transform {
    public static void main(String args[]){
        String s = "Hi,Hello,Howdy";
        List strList = s.transform(s1 -> {return Arrays.asList(s1.split(","));});
        System.out.println(strList);

    }
}
