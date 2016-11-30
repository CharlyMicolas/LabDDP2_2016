package Lab08_1606954773.SoalB;

import java.awt.*;

/**
 * Created by Charly Micolas on 19/11/2016.
 */
public class SegitigaSikusiku extends Position{
    private int alas;
    private int tinggi;

    public SegitigaSikusiku(int x, int y, int alas, int tinggi) {
        super(x, y);
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(this.x, this.y, this.x, this.y+this.tinggi);
        g.setColor(Color.black);
        g.drawLine(this.x, this.y, this.x+this.alas , this.y);
        g.setColor(Color.black);
        g.drawLine(this.x, this.y+this.tinggi,this.x+this.alas , this.y);
        g.setColor(Color.black);
    }
}
