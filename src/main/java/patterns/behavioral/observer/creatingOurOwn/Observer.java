package patterns.behavioral.observer.creatingOurOwn;

public abstract class Observer {
	protected Subject subject;
	abstract void update();
}
