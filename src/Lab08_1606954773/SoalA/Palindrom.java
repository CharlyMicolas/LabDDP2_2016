package Lab08_1606954773.SoalA;

import javax.swing.*;
/**
 * Created by Charly Micolas on 19/11/2016.
 */
public class Palindrom{

    public static void main(String[] args) {
        JOptionPane jOptionPane = new JOptionPane();
        String masukan = jOptionPane.showInputDialog(null,"Masukan String");

        Palindrom p = new Palindrom();
        if(p.isPalindrom(masukan)){
            jOptionPane.showMessageDialog(null, "Palindrom", "Hasil", JOptionPane.INFORMATION_MESSAGE);
        }else{
            jOptionPane.showMessageDialog(null, "Tidak Palindrom", "Hasil" ,JOptionPane.ERROR_MESSAGE);
        }

    }


    /**
     * Fungsi mengecek suatu kata itu palindrom atau tidak tanpa memperdulikan case sensitif huruf besar kecil
     * @param pesan
     * @return
     */
    public boolean isPalindrom(String pesan) {
        String kata = pesan.toLowerCase();
        int length = kata.length();
        for(int i=0; i<length/2; i++){
            if(kata.charAt(i)!=kata.charAt(length-i-1)){
                return false;
            }
        }
        return true;
    }
}
