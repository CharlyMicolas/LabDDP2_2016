package Lab08_1606954773.SoalB;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Charly Micolas on 19/11/2016.
 */
public class Persegi extends Position{

    protected int panjang;
    protected int lebar;

    public Persegi(int x, int y, int panjang, int lebar) {
        super(x, y);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }


    @Override
    public void paint(Graphics g) {
        g.drawRect(this.x, this.y, this.panjang, this.lebar);
        g.setColor(Color.DARK_GRAY);
    }
}
