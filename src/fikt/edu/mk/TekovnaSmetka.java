package fikt.edu.mk;

public class TekovnaSmetka extends BankarskaSmetka implements ISmetka{
    public TekovnaSmetka(int brSmetka, double kolkuPariImaNaSmetkata, String sopstvenik) {
        super(brSmetka, kolkuPariImaNaSmetkata, sopstvenik);
    }

    @Override
    public double Sostojba() {
        return this.getKolkuPariImaNaSmetkata();
    }

    @Override
    public double IzvadiPari(double kolkuPari) {
        //ima problem ako vadime povekje pari otkolku sto ima!!
        if (this.getKolkuPariImaNaSmetkata() > kolkuPari) {
            this.setKolkuPariImaNaSmetkata(this.getKolkuPariImaNaSmetkata() - kolkuPari);
            return kolkuPari;
        }
        else {
            //izvesti go korisnikot deka bas i ne moze tolku pari da se izvadat i izvadi max pari.
            double kolkuparimozedaizvadi = this.getKolkuPariImaNaSmetkata();
            this.setKolkuPariImaNaSmetkata(0.0);
            return kolkuparimozedaizvadi;
        }

    }

    @Override
    public void Pecati() {
        System.out.println("Jas sum Tekovna Smetka");
    }

    @Override
    public String KakvaSmetkaSum() {
        return "Tekovna Smetka";
    }
}
