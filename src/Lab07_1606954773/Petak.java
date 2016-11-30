package Lab07_1606954773;

import java.util.Objects;

/**
 * Created by Admin on 12/11/2016.
 */
public class Petak {
    private int pointX;
    private int pointY;
    //private Objects isi;
    private boolean isBerisi;

    public Petak(int pointX, int pointY, boolean isBerisi) {
        this.pointX = pointX;
        this.pointY = pointY;
        this.isBerisi = isBerisi;
    }

    public int getPointX() {
        return pointX;
    }

    public void setPointX(int pointX) {
        this.pointX = pointX;
    }

    public int getPointY() {
        return pointY;
    }

    public void setPointY(int pointY) {
        this.pointY = pointY;
    }

    public boolean isBerisi() {
        return isBerisi;
    }

    public void setBerisi(boolean berisi) {
        isBerisi = berisi;
    }
}
