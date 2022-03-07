package sk.stuba.fei.uim.oop.auto;

public class Vozidlo {
    protected String znacka;
    protected int pocetKolies;

    public Vozidlo(String znacka, int pocetKolies) {
        this.znacka = znacka;
        this.pocetKolies = pocetKolies;
    }

    public void trub(){
        System.out.println("tooooo");
    }
}
