package patterns.structural.decorator.creatingOurOwn;

public class MeatDecorator extends SandwichDecorator{


    public MeatDecorator(Sandwich customSandwich){
        super(customSandwich);
    }

    private String addMeat(){
         return " + Turkey";
    }


    @Override
    public String make(){
        return customSandwich.make() + addMeat();
    }
}
