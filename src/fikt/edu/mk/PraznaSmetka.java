package fikt.edu.mk;

public class PraznaSmetka implements ISmetka{
    @Override
    public void Pecati() {
        System.out.println("Jas sum PRAZNA Smetka");
    }

    @Override
    public String KakvaSmetkaSum() {
        return "Prazna Smetka";
    }
}
