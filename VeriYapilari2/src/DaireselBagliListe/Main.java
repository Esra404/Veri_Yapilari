package DaireselBagliListe;

public class Main {
    public static void main(String[] args) {

        DaireselBagliListe liste = new DaireselBagliListe();
        liste.sonaEkle(5);
        liste.sonaEkle(10);
        liste.sonaEkle(15);
        liste.sonaEkle(20);

        System.out.println("Dairesel bağlı liste:");
        liste.listele(); // Bağlı listeyi ekrana yazdır

    }
}
