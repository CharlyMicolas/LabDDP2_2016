package Lab09_1606954773;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Admin on 26/11/2016.
 */
public class PanelData extends JPanel{

    private String namaLabel;

    private JTextField jTextFieldNama, jTextFieldTanggal,jTextFieldTahun;
    private JComboBox jComboBoxBulan;

    public PanelData(String namaLabel){
        this.namaLabel = namaLabel;
        setLayout(new BorderLayout());

        JPanel jPanelAtas = new JPanel(new BorderLayout());
        jPanelAtas.setSize(500,200);

        JLabel jLabel = new JLabel(this.getNamaLabel()+ " :");
        jLabel.setHorizontalAlignment(SwingConstants.CENTER); // (optional) membuat text rata tengah
        jPanelAtas.add(jLabel, BorderLayout.NORTH);

        JPanel jPanelTengah = new JPanel(new BorderLayout());
        jPanelTengah.setSize(500,200);
        jTextFieldNama = new JTextField(20);;
        jPanelTengah.add(jTextFieldNama, BorderLayout.PAGE_START);
       // jTextFieldNama.setPreferredSize(new Dimension(20,0));

        jTextFieldTanggal = new JTextField(2);
      //  add(jTextFieldTanggal, BorderLayout.LINE_START);
        //jTextFieldTanggal.setPreferredSize(new Dimension(40,50));

       // jTextFieldTanggal.setPreferredSize(dimension);

        jComboBoxBulan = new JComboBox();
        String[] bulan = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Des"};
        for(int i=0; i<bulan.length;i++){
            jComboBoxBulan.addItem(bulan[i].toString());
        }
     //   add(jComboBoxBulan, BorderLayout.CENTER);
        //jComboBoxBulan.setPreferredSize(new Dimension(40,50));

        jTextFieldTahun = new JTextField(4);
   //     add(jTextFieldTahun, BorderLayout.LINE_END);
       // jTextFieldTahun.setPreferredSize(new Dimension(40,50));

        JPanel jFlowPanel = new JPanel(new FlowLayout());
        jFlowPanel.setSize(500,200);
        jFlowPanel.add(jTextFieldTanggal);
        jFlowPanel.add(jComboBoxBulan);
        jFlowPanel.add(jTextFieldTahun);

        add(jPanelAtas, BorderLayout.NORTH);
        add(jPanelTengah, BorderLayout.CENTER);
        add(jFlowPanel, BorderLayout.SOUTH);

    }

    public String getNamaLabel() {
        return namaLabel;
    }

    public void setNamaLabel(String namaLabel) {
        this.namaLabel = namaLabel;
    }

    public JTextField getjTextFieldNama() {
        return jTextFieldNama;
    }

    public void setjTextFieldNama(JTextField jTextFieldNama) {
        this.jTextFieldNama = jTextFieldNama;
    }

    public JTextField getjTextFieldTanggal() {
        return jTextFieldTanggal;
    }

    public void setjTextFieldTanggal(JTextField jTextFieldTanggal) {
        this.jTextFieldTanggal = jTextFieldTanggal;
    }

    public JTextField getjTextFieldTahun() {
        return jTextFieldTahun;
    }

    public void setjTextFieldTahun(JTextField jTextFieldTahun) {
        this.jTextFieldTahun = jTextFieldTahun;
    }

    public JComboBox getjComboBoxBulan() {
        return jComboBoxBulan;
    }

    public void setjComboBoxBulan(JComboBox jComboBoxBulan) {
        this.jComboBoxBulan = jComboBoxBulan;
    }
}
