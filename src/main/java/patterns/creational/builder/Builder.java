package patterns.creational.builder;

public class Builder {
    /*
    the builder can handle complex constructors with large number of parameters
    or lots of setters, can force immutability

    the builder can help decide which constructor to use
    the creation of multiple parameterized constructor is called a telescoping constructor
    builder typically has a static inner class, can call appropriate constructor based off of its state
    negates the need for exposed setters

    builder patter doesnt have many negative things about it
    but typiccly designed to be immutable
    also designed to contain a static inner class/ but doesnt always have to contain it it can be a seperate class if you choose
    the builder is similar to just overloaded constructors but doesnt have the nice features that the builder has

    builder patter is meant to handle complex constructors
    doesnt need to contain an interface
    can be a seperate class
    works with legacy code

    Examples:
    StringBuilder
    DocumentBuilder
    Locale.Builder

     */

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        builder.append("This is an example ");

        builder.append("of the builder pattern. ");

        builder.append("It has methods to append ");

        builder.append("almost anything we want to a string. ");

        builder.append(42);

        System.out.println(builder.toString());

    }
}
