package VizeHazirlik.TekYonluBagliListe.ornek2;

public class Main {



    public static void main(String[] args) {
        BagliListe liste1=new BagliListe();
        liste1.basaEkle(2);
        liste1.basaEkle(3);
        liste1.basaEkle(98);
        liste1.basaEkle(12);
        System.out.print(" ");
        liste1.listeyazdir();
    }

}
