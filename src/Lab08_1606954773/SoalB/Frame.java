package Lab08_1606954773.SoalB;

import javafx.geometry.Pos;

import javax.swing.*;
import java.util.Objects;

/**
 * Created by Charly Micolas on 19/11/2016.
 */

public class Frame extends JFrame {
    private String nama;
    private Position position;

    public Frame(String nama, Position position){
        setTitle(nama);
        add(position);

        setSize(600, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
