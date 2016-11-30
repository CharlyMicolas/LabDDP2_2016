package Tugas2_1606954773_CharlyMicolas;

/**
 * Created by Admin on 13/10/2016.
 */
public class Main {
    public static void main(String[] args) {
        Binatang keti = new Kucing("Tomket");
        System.out.println(keti.getNama()); //Tomket
        keti.setUmur(keti.getUmur() + 2);
        System.out.println(keti.getUmur()); //3
        keti.move(10); //Kucing Tomket berlari sejauh 10 km
        keti.eat("Mikimos"); //Tomket makan Mikimos
        keti.bersuara(); //Kucing Tomket: Ngeong ngeong...
        Binatang birdi = new Burung();
        System.out.println(birdi.getNama()); //Tanpa Nama
        System.out.println(birdi.getUmur()); //1
        birdi.eat("Larva"); //Tanpa Nama makan Larva
        birdi.move(35); //Burung Tanpa Nama terbang setinggi 35 km
        birdi.setNama("Twiti");
        birdi.bersuara(); //Burung Twiti: Cit cit cuit...
        ((Kucing)keti).move(birdi.getNama()); //Kucing Tomket mendekati Twiti
        keti.eat(birdi.getNama()); //Kucing Tomket makan Twiti
        Kendaraan libom = new Mobil("Do car", 4, "bensin");
        System.out.println(((Mobil)libom).getMerk()); //Do car
        System.out.println(libom.getKapasitas()); //4
        libom.move(98); //Mobil Do car melaju sejauh 98 km
        Mobil libom2 = (Mobil)libom;
        libom2.setMerk("Ci car");
        System.out.println(libom2.getMerk()); //Ci car
        Kendaraan hell = new Heli(3, "pertamak");
        System.out.println(hell.getBBM()); //pertamak
        System.out.println(hell.getKapasitas()); //3
        hell.move(14); //Mobil terbang setinggi 14 km
    }
}
