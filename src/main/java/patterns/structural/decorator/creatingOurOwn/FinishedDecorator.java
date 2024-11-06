package patterns.structural.decorator.creatingOurOwn;

public class FinishedDecorator extends SandwichDecorator{
    public FinishedDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    private String addBread(){
        return " + Bread";
    }

    @Override
    public String make(){
        return customSandwich.make() + addBread();
    }
}
