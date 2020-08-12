package ImmutableListAndSet;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args){

        List immutableList = List.of();
        List nonEmptyImmutableList = List.of("one","two","three");
        //immutableList.add(1);
        //System.out.println(nonEmptyImmutableList.set(0,"two"));
        System.out.println(nonEmptyImmutableList);
        Map nonemptyImmutableMap = Map.of(1, "one", 2, "two", 3, "three");
        System.out.println(nonemptyImmutableMap);
    }
}
