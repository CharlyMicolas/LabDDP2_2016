package Lab04_1606954773.SoalA;

/**
 * 
 * @author charly.micolas
 *
 */
public class DemoInterface {
    public static void main(String[] args) {
        Pelamar cMekanik1, cMekanik2;
        Pelamar cManHRD, cManPem, cMan;

        cMekanik1 = new CalonMekanik("Squee", 90, 70, 67);
        System.out.println("Nama: "+cMekanik1.getNama());
        System.out.println("Nilai tertulisnya: "+cMekanik1.getNilaiTertulis());
        System.out.println("Nilai wawancaranya: "+cMekanik1.getNilaiWawancara());
        System.out.println("Statusnya: "+cMekanik1.getStatus());
        System.out.println();

        cMekanik2 = new CalonMekanik("Boush", 30, 60, 80);
        System.out.println("Nama: "+cMekanik2.getNama());
        System.out.println("Nilai tertulisnya: "+cMekanik2.getNilaiTertulis());
        System.out.println("Nilai wawancaranya: "+cMekanik2.getNilaiWawancara());
        System.out.println("Statusnya: "+cMekanik2.getStatus());
        System.out.println();

        cManHRD = new CalonHRD("Luna", 67, 90, 95, 80);
        System.out.println("Nama: "+cManHRD.getNama());
        System.out.println("Nilai tertulisnya: "+cManHRD.getNilaiTertulis());
        System.out.println("Nilai wawancaranya: "+cManHRD.getNilaiWawancara());
        System.out.println("Nilai tes kepribadiannya: "+cManHRD.getNilaiKepribadian());
        System.out.println("Statusnya: "+cManHRD.getStatus());
        System.out.println();

        cManPem = new CalonPemasaran("Rylai", 100, 90, 21, 50);
        System.out.println("Nama: "+cManPem.getNama());
        System.out.println("Nilai tertulisnya: "+cManPem.getNilaiTertulis());
        System.out.println("Nilai wawancaranya: "+cManPem.getNilaiWawancara());
        System.out.println("Nilai tes kepribadiannya: "+cManPem.getNilaiKepribadian());
        System.out.println("Statusnya: "+cManPem.getStatus());

        System.out.println();
        cMan = new CalonManajer("Kardil", 70, 85, 90);
        System.out.println("Nama: "+cMan.getNama());
        System.out.println("Nilai tertulisnya: "+cMan.getNilaiTertulis());
        System.out.println("Nilai wawancaranya: "+cMan.getNilaiWawancara());
        System.out.println("Nilai tes kepribadiannya: "+cMan.getNilaiKepribadian());
        System.out.println("Statusnya: "+cMan.getStatus());
        System.out.println();
    }
}
