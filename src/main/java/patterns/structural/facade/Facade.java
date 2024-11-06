package patterns.structural.facade;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Facade {
    /*
    makes api easier to use
    helps reduce external dependencies
    simple interface
    typically refactoring pattern

    its a class that utilitizes composition
    shouldnt need to inherite if it does this might not be the pattern for you
    facade contains other classes

    pitfalls of facade is it typically used to clean up code
    should thing about the API design before creating
    it typically shouldn't utilize inheritance
    deals with a flat problem/ structure
    is the singleton of structural patterns

    simplifies interface
    works with composites
    cleaner api


    Examples:
    java.net.URL

     */

    public static void main(String[] args)throws Exception {
        URL url = new URL("https://www.pluralsight.com/author/bryan-hansen").toURI().toURL();

        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        String inputLine;

        while ((inputLine = in.readLine()) != null){
            System.out.println(inputLine);
        }
    }
}
