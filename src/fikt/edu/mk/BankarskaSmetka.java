package fikt.edu.mk;

public abstract class BankarskaSmetka implements ISmetka {
    private int brSmetka;
    private double kolkuPariImaNaSmetkata;
    private String sopstvenik;

    public abstract double Sostojba();

    //metodot IzvadiPari , vadi od smetkata onolku pari kolku sto e definirano vo param kolkuPari,
    // a vrakja vrednost vsushnost kolku pari se izvadile
    public abstract double IzvadiPari(double kolkuPari);

    public int getBrSmetka() {
        return brSmetka;
    }

    public double getKolkuPariImaNaSmetkata() {
        return kolkuPariImaNaSmetkata;
    }

    public BankarskaSmetka(int brSmetka, double kolkuPariImaNaSmetkata, String sopstvenik) {
        this.brSmetka = brSmetka;
        this.kolkuPariImaNaSmetkata = kolkuPariImaNaSmetkata;
        this.sopstvenik = sopstvenik;
    }

    public void setKolkuPariImaNaSmetkata(double kolkuPariImaNaSmetkata) {
        this.kolkuPariImaNaSmetkata = kolkuPariImaNaSmetkata;
    }

    public void setBrSmetka(int brSmetka) {
        this.brSmetka = brSmetka;
    }

    public String getSopstvenik() {
        return sopstvenik;
    }

    public void setSopstvenik(String sopstvenik) {
        this.sopstvenik = sopstvenik;
    }



}
