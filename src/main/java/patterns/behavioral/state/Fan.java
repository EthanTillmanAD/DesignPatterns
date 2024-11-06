package patterns.behavioral.state;

public class Fan {

    static final int OFF = 0;
    static final int LOW = 1;
    static final int MED = 2;

    int state = OFF;

    public Fan(){


    }

    public void pullChain(){
        if (state == OFF){
            System.out.println("Turing fan on to low.");
            state = LOW;
        } else if (state == LOW) {
            System.out.println("Turning fan to med.");
            state = MED;
        } else if (state == MED) {
            System.out.println("Turning fan off.");
            state = OFF;
        }
    }

    public String toString(){
        if (state == OFF){
            return "Fan is Off";

        } else if (state == LOW) {
           return "fan is on low";
        } else if (state == MED) {
            return "Fan is on Med";
        }
        return "invalid state";
    }

}
