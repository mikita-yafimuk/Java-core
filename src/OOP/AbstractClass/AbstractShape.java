package OOP.AbstractClass;

import javax.swing.*;
import java.awt.Graphics;

public abstract class AbstractShape extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        paintShape(g);
    }

    abstract protected void paintShape(Graphics g);
}
