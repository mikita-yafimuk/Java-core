package core.swing.appwindow.events.types;

import core.swing.appwindow.events.Event;

public class MouseReleasedEvent extends MouseButtonEvent
{

	public MouseReleasedEvent(int keyCode, int x, int y)
	{
		super(Event.Type.MOUSE_RELEASED, keyCode, x, y);
	}

}
