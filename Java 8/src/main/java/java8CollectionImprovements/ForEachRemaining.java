package java8CollectionImprovements;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachRemaining {

    public static void main(String[] args) {
        //creating sample Collection
        List<Integer> myList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) myList.add(i);
        Iterator<Integer> itr = myList.iterator();
        itr.forEachRemaining((val)->{

            System.out.println(val);

        });

    }

}
