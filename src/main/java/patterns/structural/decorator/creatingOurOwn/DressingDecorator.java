package patterns.structural.decorator.creatingOurOwn;

public class DressingDecorator extends SandwichDecorator{

    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }


    private String addDressing(){
        return " + Ranch";
    }

    @Override
    public String make(){
        return customSandwich.make() + addDressing();
    }

}
