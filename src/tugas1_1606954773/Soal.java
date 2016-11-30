package tugas1_1606954773;

/**
 * Created by Charly on 22/09/2016.
 *
 * Class ini akan meyimpan object soal yang ditampilkan serta hasil operasi(jawaban soal).
 * Jawaban soal tersebut akan dicocokan dengan jawaban yang dimasukkan oleh anak
 */
public class Soal {
    private Fraction pecahan1;
    private String operasi;         // Operasi +, - , x , atau :
    private Fraction pecahan2;
    private Fraction hasilOperasi;  // menyimpan kunci jawaban yang akan dicocokkan dengan jawaban user

    public Soal(Fraction pecahan1, String operasi, Fraction pecahan2) {
        this.pecahan1 = pecahan1;
        this.operasi = operasi;
        this.pecahan2 = pecahan2;
        this.hasilOperasi = new Fraction();
        if(this.operasi.equals("+")){
            hasilOperasi = hasilOperasi.add(pecahan1,pecahan2);
        }
        else if(this.operasi.equals("-")){
            hasilOperasi = hasilOperasi.subt(pecahan1,pecahan2);
        }
        else if(this.operasi.equals("x")){
            hasilOperasi = hasilOperasi.times(pecahan1,pecahan2);
        }
        else if(this.operasi.equals(":")){
            hasilOperasi = hasilOperasi.divide(pecahan1,pecahan2);
        }
        else {
            System.out.println("Operasi yang dimasukkan tidak dikenal.");
        }
    }

    public Fraction getPecahan1() {
        return pecahan1;
    }

    public void setPecahan1(Fraction pecahan1) {
        this.pecahan1 = pecahan1;
    }

    public String getOperasi() {
        return operasi;
    }

    public void setOperasi(String operasi) {
        this.operasi = operasi;
    }

    public Fraction getPecahan2() {
        return pecahan2;
    }

    public void setPecahan2(Fraction pecahan2) {
        this.pecahan2 = pecahan2;
    }

    public Fraction getHasilOperasi() {
        return hasilOperasi;
    }

    public void setHasilOperasi(Fraction hasilOperasi) {
        this.hasilOperasi = hasilOperasi;
    }

    /**
     * Menampilkan soal kepada user
     * @return
     */
    public String displaySoal() {
        String view= this.getPecahan1().display() + " " + this.getOperasi() + " " + this.getPecahan2().display() + " = ";

        return  view;
    }

    /**
     * Menampilkan review untuk mencocokan jawaban si anak dengan kunci jawaban, serta berapa lama waktu pengerjaan tiap soal
     * @return
     */
    public String reviewSoal() {
        String view= this.getPecahan1().display() + " " + this.getOperasi() + " " + this.getPecahan2().display() + " = "+this.getHasilOperasi().display();

        return  view;
    }




}
