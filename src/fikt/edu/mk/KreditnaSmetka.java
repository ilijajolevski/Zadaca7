package fikt.edu.mk;

public class KreditnaSmetka extends BankarskaSmetka {

    private double kreditenLimit;

    public double getKreditenLimit() {
        return kreditenLimit;
    }

    public void setKreditenLimit(double kreditenLimit) {
        this.kreditenLimit = kreditenLimit;
    }

    public KreditnaSmetka(int brSmetka, double kolkuPariImaNaSmetkata, String sopstvenik, double kreditenLimit) {
        super(brSmetka, kolkuPariImaNaSmetkata, sopstvenik);
        this.setKreditenLimit(kreditenLimit);
    }

    @Override
    public double Sostojba() {
        return this.getKolkuPariImaNaSmetkata();
    }

    @Override
    public double IzvadiPari(double kolkuPari) {
            //todo treba da se proveri dali imame dovolno krediten limit (dozvolen minus)
            this.setKolkuPariImaNaSmetkata(this.getKolkuPariImaNaSmetkata() - kolkuPari);
            return kolkuPari;
    }

    @Override
    public void Pecati() {
        System.out.println("Jas sum Kreditna Smetka");
    }

    @Override
    public String KakvaSmetkaSum() {
        return "Kreditna Smetka";
    }
}
