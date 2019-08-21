package core.swing.appwindow.events;

public class Event
{

	public boolean handled;
	private Type type;
	protected Event(Type type)
	{
		this.type = type;
	}

	public Type getType()
	{
		return type;
	}

	public enum Type
	{
		MOUSE_MOVED,
		MOUSE_PRESSED,
		MOUSE_RELEASED,
	}
}
