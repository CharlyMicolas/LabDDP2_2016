package Lab08_1606954773.SoalB;

import java.awt.*;

/**
 * Created by Charly Micolas on 19/11/2016.
 */
public class SegitigaSamasisi extends Position {
    private int sisiSegitiga;

    public SegitigaSamasisi(int x, int y, int sisiSegitiga) {
        super(x, y);
        this.sisiSegitiga = sisiSegitiga;
    }

    public int getSisiSegitiga() {
        return sisiSegitiga;
    }

    public void setSisiSegitiga(int sisiSegitiga) {
        this.sisiSegitiga = sisiSegitiga;
    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(this.x, this.y, this.x+(this.sisiSegitiga/2), this.y+this.sisiSegitiga);
        g.setColor(Color.black);
        g.drawLine(this.x, this.y, this.x+this.sisiSegitiga , this.y);
        g.setColor(Color.black);
        g.drawLine(this.x+(this.sisiSegitiga/2), this.y+this.sisiSegitiga,this.x+this.sisiSegitiga , this.y);
        g.setColor(Color.black);

    }
}
