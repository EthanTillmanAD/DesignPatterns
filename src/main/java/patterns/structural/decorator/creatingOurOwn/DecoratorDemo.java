package patterns.structural.decorator.creatingOurOwn;

public class DecoratorDemo {
    public static void main(String[] args) {
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new FinishedDecorator(new SimpleSandwich())));

        System.out.println(sandwich.make());

    }
}
