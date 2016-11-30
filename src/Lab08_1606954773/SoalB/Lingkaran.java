package Lab08_1606954773.SoalB;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

/**
 * Created by Charly Micolas on 19/11/2016.
 */
public class Lingkaran extends Position {
    private int diameter;

    public Lingkaran(int x, int y, int diameter) {
        super(x, y);
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void paint(Graphics g) {
        g.drawOval(this.x, this.y, this.diameter, this.diameter);
        g.setColor(Color.DARK_GRAY);
    }
}
