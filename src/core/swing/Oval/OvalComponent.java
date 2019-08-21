package core.swing.Oval;

import java.awt.*;

import javax.swing.*;

public class OvalComponent extends JComponent
{

	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		g.drawOval(5, 5, getWidth() - 10, getHeight() - 10);
	}
}
