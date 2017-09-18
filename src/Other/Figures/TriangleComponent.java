package Other.Figures;

import javax.swing.*;
import java.awt.*;

public class TriangleComponent extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(5, getHeight() - 10, getWidth()/2 - 5, 5);
        g.drawLine(getWidth()/2 - 5, 5, getWidth() - 10, getHeight() - 10);
        g.drawLine(getWidth() - 10, getHeight() - 10, 5, getHeight() - 10);
    }
}
