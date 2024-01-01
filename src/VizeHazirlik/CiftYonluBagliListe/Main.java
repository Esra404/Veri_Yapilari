package VizeHazirlik.CiftYonluBagliListe;

public class Main {
    public static void main(String[] args) {
        CiftBagliListe liste =new CiftBagliListe();
        liste.basaEkle(12);
        liste.basaEkle(23);
        liste.basaEkle(28);
        liste.basaEkle(123);
        System.out.println("işte eklenen elemanlar");
        liste.yazdir();

    }
}
