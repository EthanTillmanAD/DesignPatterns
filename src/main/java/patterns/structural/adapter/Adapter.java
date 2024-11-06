package patterns.structural.adapter;

import java.util.Arrays;
import java.util.List;

public class Adapter {
    /*
    think of adapter pattern to a plug adapter
    if you want to have a client talk to an existing interface this is a good pattern to use
    usually the case when legacy is used
    translate requests
    client, adapter, adaptee
    very client centric
    integrate new with old
    can have an interface but not required
    adaptee can be the implementation
    adapter patterns can easily turn to decorator pattern
    with an adapter class if added a toString can be seen more as a decorator

    pitfalls for the adapter is sometimes people overcomplicate them
    typically has multiple adapters but not always
    dont add functionality

    simple solution to some problems
    easy to implement

    Examples:
    Arrays to Lists conversion
    Streams classes



     */
    public static void main(String[] args) {

        Integer[] arrayOfInts = new Integer[]{42, 43, 44};

        List<Integer> list = Arrays.asList(arrayOfInts);

        System.out.println(Arrays.toString(arrayOfInts));
        System.out.println(list);
    }
}
