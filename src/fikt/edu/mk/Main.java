package fikt.edu.mk;

public class Main {

    public static void main(String[] args) {
	// write your code here

    TekovnaSmetka tekovnaSmetka = new TekovnaSmetka(120, 100.0, "ilija");
    //tekovnaSmetka.Sostojba();
    System.out.println("Na smetkata ima: " +  tekovnaSmetka.Sostojba());
    System.out.println("sakam da izvadam 160.0 ");
    double izvadenipari = tekovnaSmetka.IzvadiPari(160.0);
    System.out.println("Izvadovme tolku pari: " +  izvadenipari);
    System.out.println("Na smetkata ostanaa: " +  tekovnaSmetka.Sostojba());


    KreditnaSmetka kreditnaSmetka = new KreditnaSmetka(125, 100.0, "ilija", 1000);
        System.out.println("Na smetkata ima: " +  kreditnaSmetka.Sostojba());
        System.out.println("sakam da izvadam 160.0 ");
        double izvadenipar1 = kreditnaSmetka.IzvadiPari(160.0);
        System.out.println("Izvadovme tolku pari: " +  izvadenipar1);
        System.out.println("Na smetkata ostanaa: " +  kreditnaSmetka.Sostojba());


        System.out.println(tekovnaSmetka.KakvaSmetkaSum());
        System.out.println(kreditnaSmetka.KakvaSmetkaSum());

        PraznaSmetka ps = new PraznaSmetka();

        Abstrakcija a = new Abstrakcija();
        a.VidiKakvaSmetkaE(tekovnaSmetka);
        a.VidiKakvaSmetkaE(kreditnaSmetka);
        a.VidiKakvaSmetkaE(ps);

    }




}
