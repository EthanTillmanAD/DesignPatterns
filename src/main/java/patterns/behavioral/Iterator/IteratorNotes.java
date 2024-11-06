package patterns.behavioral.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorNotes {
    /*
    Iterator patterns are good for Traverse a container
    doesnt expose underlying structure
    decouples data from algorithms
    sequential in nature

    its interface based
    follows a factory method based
    independent but fail fast - that two iterators can't modify the underlying structure without an error being thrown

    Enumerators are fail safe - built a way that it cant be used to fail

    pitfalls of the iterator
    we dont have access to the index position
    its directional - it can only go forward
    it can be a bit slower and not as efficient

    Examples:
    java.util.Iterator
    java.util.Enumeration


     */

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Bryan");
        names.add("Aaron");
        names.add("John");

        Iterator<String> namesItr = names.iterator();

        while (namesItr.hasNext()){
            String name = namesItr.next();
            System.out.println(name);
            namesItr.remove();
        }
    }
}
