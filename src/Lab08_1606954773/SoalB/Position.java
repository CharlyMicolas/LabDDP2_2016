package Lab08_1606954773.SoalB;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Charly Micolas on 19/11/2016.
 */
public abstract class Position extends JPanel{

    protected int x;
    protected int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public abstract void paint(Graphics g);
}
