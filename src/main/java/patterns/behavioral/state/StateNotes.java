package patterns.behavioral.state;

public class StateNotes {
    /*
    state patterns are goood if you want to localize state behavior
    makes current application state stored in an object rather than all over the place
    can also help separate what state we are in
    also makes your objects follow the open‑closed principle

    state is normally designed as an abstract class or interface doesnt always apply
    states are then  class based and represented by an individual class per state
    context or subject of multiple states are unaware of various state patterns

    pitfalls of state
    some lose track of the state know your state
    can have more classes then you would have if you had just implemented using more traditional methods
    keeping logic in state objects and not letting conditional logic creep back into the context
    be aware of what triggers a state to change

    state only knows about the next state that it can transition to


    Examples:
    None
     there is an instance in JSF
     and can be seen in the iterator but there arent any good examples
     */

    public static void main(String[] args) {

        Fan fan = new Fan();

        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);

        fan.pullChain();



    }


}
