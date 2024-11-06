package patterns.structural.decorator.creatingOurOwn;

public class SimpleSandwich implements Sandwich{
    @Override
    public String make() {
        return "Bread";
    }
}
