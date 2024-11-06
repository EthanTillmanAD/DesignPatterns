package patterns.creational.prototype.creatingOurOwn;

public class TestDemo {
    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Creational Patterns in Java");

        System.out.println(movie);
        System.out.println(movie.getRunTime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

        Movie movie1 = (Movie) registry.createItem("Movie");
        movie1.setTitle("Hello from the Java world");

        System.out.println(movie1);
        System.out.println(movie1.getRunTime());
        System.out.println(movie1.getTitle());
        System.out.println(movie1.getUrl());


    }
}
