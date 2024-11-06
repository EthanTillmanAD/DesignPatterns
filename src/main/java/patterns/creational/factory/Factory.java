package patterns.creational.factory;

import java.util.Calendar;

public class Factory {
    /*
    opposite to singleton
    one of the most used patterns
    defer to subclasses
    specified by architecture, implemented by user
    responsible for the lifecycle
    will reference concrete classes but client can be unaware of them because of the common interface
    typically has a parameterized create method

    can be used in an abstract class or interface
    best to use a class separate to construct the objects and call in the main
    can use an enum to eliminate string literals from the factory

    some of the pitfalls of the factory pattern is its really complex
    creation happens in the subclasses not the factory
    it needs to be defined as a factory first in planning due to refactoring is difficult


    returns various instances unlike the singleton
    multiple constructors
    interface driven
    always has subclasses involved
    and more adaptable
    Parameter driven
    solves complex creation


    Example:
    Calendar
    ResourceBundle
    NumberFormat

     */
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        //Calendar cal = Calendar.get
        System.out.println(cal);

        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
    }
}
