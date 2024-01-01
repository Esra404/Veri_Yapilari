package BagliListeler;

public class Main {
    public static void main(String[] args) {
        BagliListe liste = new BagliListe();
        liste.basaEkle(5);
        liste.basaEkle(30);
        liste.basaEkle(15);
        liste.basaEkle(20);

        System.out.println("Bağlı liste:");
        liste.listele(); // Bağlı listeyi ekrana yazdır
    }
}
