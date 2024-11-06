package patterns.behavioral.command.creatingOurOwn;
//concrete command
public class ToggleCommand implements Command {

	private Light light;
	
	public ToggleCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.toggle();
	}
}