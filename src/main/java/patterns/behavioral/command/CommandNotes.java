package patterns.behavioral.command;

public class CommandNotes {
    /*
    command pattern encapsulates request as an object
    each call back is object oriented
    sender is decoupled from the processor
    often used for undo functionality

    sometimes can be seen as object oriented breaking
    object per command
    mainly held inside the command interface
    and contains an execute method
    and sometimes contains and undo/unexecute method
    advanced use often have reflections to decouple the client from the reciever
    command invoker concreteCommand

    some pitfalls for the command
    dependent on other patterns
    multiple command patterns
    its a good idea to look at prototype for making copies of the command pattern

    class contains the "what" -> we are trying to do

    very few drawbacks for this pattern


    Examples:
    java.lang.Runnable
    javax.swing.Action



     */

    public static void main(String[] args) {
        Task task1 = new Task(10,12);
        Task task2 = new Task(11,13);

        Thread thread1 = new Thread(task1);
        thread1.start();
        Thread thread2 = new Thread(task2);
        thread2.start();

    }
    static class Task implements Runnable {

        int num1;
        int num2;

        Task(int num1, int num2) {
            this.num1 = num1;
            this.num2 = num2;
        }

        @Override
        public void run() { //execute method
            System.out.println(num1 * num2); //receiver
        }
    }
}