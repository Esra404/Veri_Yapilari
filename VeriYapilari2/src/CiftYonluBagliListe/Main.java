package CiftYonluBagliListe;

public class Main {
    public static void main(String[] args) {

        CiftYonluBagliListe liste = new CiftYonluBagliListe();
        liste.basaEkle(5);
        liste.basaEkle(10);
        liste.basaEkle(15);
        liste.basaEkle(20);

        System.out.println("Çift yönlü bağlı liste:");
        liste.listele(); // Bağlı listeyi ekrana yazdır

    }
}
