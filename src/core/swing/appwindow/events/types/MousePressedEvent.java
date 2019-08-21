package core.swing.appwindow.events.types;

import core.swing.appwindow.events.Event;

public class MousePressedEvent extends MouseButtonEvent
{

	public MousePressedEvent(int keyCode, int x, int y)
	{
		super(Event.Type.MOUSE_PRESSED, keyCode, x, y);
	}

}
