package patterns.behavioral.command.creatingOurOwn;
//invoker
public class Switch {

	public void storeAndExecute(Command command) {
		command.execute();
	}
}
