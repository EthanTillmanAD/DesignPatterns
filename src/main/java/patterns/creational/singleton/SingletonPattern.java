package patterns.creational.singleton;

public class SingletonPattern {

    /*
    Singleton patterns need to have a private instance to the class that is static
    a private constructor and a static getInstance method

    singleton can only make one object and set it to an instance

    pitfalls of a singleton is often overused, not everything need to be a singleton
    can be difficult to test, if not careful it wont be thread safe and sometimes can be confused for a factory
    once it needs an argument it becomes a factory instead of a singleton
    can be confused for a prototype




     */

    private final SingletonPattern INSTANCE = new SingletonPattern();

    private SingletonPattern(){//No parameters required for construction

    }

    public SingletonPattern getINSTANCE(){
        return INSTANCE;
    }



}
class Main{
    public static void main(String[] args) {
        Runtime singleton = Runtime.getRuntime();

        singleton.gc();

        System.out.println(singleton);

        Runtime another = Runtime.getRuntime();

        System.out.println(another);


    }

}