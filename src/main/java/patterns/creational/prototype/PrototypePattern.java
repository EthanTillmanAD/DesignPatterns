package patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypePattern {
    /*
    prototype is the best choice when you want to avoid costly creations
    they also avoid subclassing
    and typically doesn't use the new keyword / after one it uses clone after that
    the often utilizes a interface
    and usually implements a registry
    has a clone/cloneable method
    it also can have a parameterized constructor unlike the singleton pattern
    ShallowCopy - just copys the immediate properties
    DeepCopy - this will copy any of the object referral statements along with properties


    for a shallow copy if we have multiple classes that make objects we only need one clone method in each

    for a deep copy with multiple classes we need a clone method in each of them

    prototype is almost the opposite of builder pattern

    some of the pitfalls of a prototype is they aren't always used
    sometime used with other patterns
    sometimes need to implement some type of registry
    clone interface automatically set up a shallow copy not deep
    if a deep copy is wanted you have to code out the deep copy on your own

    lighter weight construction
    copy of itself
    shallow and deep




    Examples:
    java.lang.Object#clone()



     */

    public static void main(String[] args) {
        String sql = "select * from movies where title = ";

        List<String> parameters = new ArrayList<>();

        parameters.add("Star wars");

        Record record = new Record();

        Statement statement = new Statement(sql,parameters,record);

        System.out.println(statement.getSql());
        System.out.println(statement.getParameters());
        System.out.println(statement.getRecord());

        Statement clonedStatment = statement.clone();


        System.out.println(statement.getSql());
        System.out.println(statement.getParameters());
        System.out.println(statement.getRecord());



    }
}
