package tugas1_1606954773;

/**
 * Created by Charly on 25/09/2016.
 *
 * Class ini menyimpan atribut jawaban yang dimasukkan anak serta waktu pengerjaan tiap soal
 */
public class JawabanAnak {

    private long waktuMenjawabPerSoal;  // menyimpan waktu yang dibutuhkan user mengerjakan soal
    private Fraction jawabanSoal;       // jawaban yang dimasukkan user

    public JawabanAnak(long waktuMenjawabPerSoal, Fraction jawabanSoal) {
        this.waktuMenjawabPerSoal = waktuMenjawabPerSoal;
        this.jawabanSoal = jawabanSoal;
    }

    public long getWaktuMenjawabPerSoal() {
        return waktuMenjawabPerSoal;
    }

    public void setWaktuMenjawabPerSoal(int waktuMenjawabPerSoal) {
        this.waktuMenjawabPerSoal = waktuMenjawabPerSoal;
    }

    public Fraction getJawabanSoal() {
        return jawabanSoal;
    }

    public void setJawabanSoal(Fraction jawabanSoal) {
        this.jawabanSoal = jawabanSoal;
    }
}
