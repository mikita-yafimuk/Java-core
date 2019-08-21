package core.oop.abstractclass;

import java.awt.*;

import javax.swing.*;

public abstract class AbstractShape extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        paintShape(g);
    }

    abstract protected void paintShape(Graphics g);
}
