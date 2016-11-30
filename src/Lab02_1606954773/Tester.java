package Lab02_1606954773;


public class Tester {

    public static void main(String[] args) {
    	Pelatih pelatih1 = new Pelatih("Agung", 20000, 1, 5);
        pelatih1.randomStartingMonster();
        
        Pelatih pelatih2 = new Pelatih("David", 40000, 3, 3);
        pelatih2.randomStartingMonster();
        
        Pelatih pelatih3 = new Pelatih("Charly", 50000, 2, 4);
        pelatih3.randomStartingMonster();

    	Barang pedang = new Barang("pedang", 50);
        Barang panah = new Barang("panah", 20);
        Barang ketapel =  new Barang("ketapel", 5);
        Barang tombak = new Barang("tombak", 2);
        Barang perisai = new Barang("perisai", 5);
        Barang cannon = new Barang("cannon", 7);
        Barang sabuk =  new Barang("sabuk", 8);
        
        Monster monsterTikus =  new Monster("Monster Tikus", 3, "Tumbuhan",10);
        Monster monsterNaga =  new Monster("Monster Naga", 5, "Api", 10);
        Monster monsterHiu = new Monster("Monster Hiu", 4, "Air", 10);
        Monster monsterKelinci = new Monster("Monster Kelinci", 3, "Tumbuhan", 10);
        Monster monsterBuaya = new Monster("Monster Buaya", 4, "Api",10);
        Monster monsterUbur = new Monster("Monster Ubur", 4, "Air",10);
        Monster monsterKerbau = new Monster("Monster Kerbau", 3, "Tumbuhan",10);
     /*   
        //test jumlah barang yang bisa masuk sesuai kapasitas tas
        pelatih3.addBarang(pedang);
        pelatih3.addBarang(panah);
        pelatih3.addBarang(ketapel);
        pelatih3.addBarang(tombak);
        pelatih3.addBarang(cannon);
        pelatih3.addBarang(sabuk);

      //test jumlah jumlah monster maksimal 6
        pelatih3.addMonster(monsterKelinci);
        pelatih3.addMonster(monsterTikus);
        pelatih3.addMonster(monsterUbur);
        pelatih3.addMonster(monsterBuaya);
        pelatih3.addMonster(monsterKerbau);
        pelatih3.addMonster(monsterNaga);
        pelatih3.addMonster(monsterHiu);*/
        
        
        BatleArena arena = new BatleArena("Arena1", "Jakarta");

        arena.daftarkanPelatih(pelatih1);
        arena.daftarkanPelatih(pelatih2);
     
        arena.prototypeBatle(pelatih1, pelatih2);
        System.out.println();
        
        arena.prototypeBatle(pelatih1, pelatih3);
        System.out.println();
        
        
    
    }
}
