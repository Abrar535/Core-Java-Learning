package SomeAddedApis;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String args[]) {
        List<String> actors = new ArrayList<>();
        actors.add("Abrar");
        actors.add("Taran");
        System.out.println(actors); // prints [Abrar, Taran]
// New API added - Creates an UnModifiable List from a List.
        List<String> copyOfActors = List.copyOf(actors);
        System.out.println(copyOfActors); // prints [Abrar, Taran]
// copyOfActors.add("Fuad"); Will generate an
// UnsupportedOperationException
        actors.add("Fuad");
        System.out.println(actors);// prints [Abrar, Tahsin, Fuad]
        System.out.println(copyOfActors); // prints [Abrar, Taran]

        String str =  "hello" , str1 = null;
        Optional<String> name = Optional.ofNullable(str);
        Optional<String> name1 = Optional.ofNullable(str1);

// New API added
        name.orElseThrow(); // same as name.get()
        System.out.println(name);
        System.out.println(name1);
//  If optional value is null the orElseThrow() method will throw an exception.
//        name1.orElseThrow();

// New API added - Collectors.toUnmodifiableList
        List<String> collect = actors.stream().collect(Collectors.toUnmodifiableList());
// collect.add("Raihan"); // Will generate an UnsupportedOperationException
        System.out.println(collect);
    }
}
