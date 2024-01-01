package BagliListeler;

public class BagliListe {
    Dugum bas; // Bağlı listenin başlangıç düğümü

    // Yeni bir düğümü listenin başına ekleme metod
    public void basaEkle(int veri) {
        Dugum yeniDugum = new Dugum(veri); // Yeni düğüm oluştur
        yeniDugum.sonraki = bas; // Yeni düğümü mevcut başlangıç düğümü olarak ata
        bas = yeniDugum; // Yeni düğümü başlangıç düğümü olarak belirle
    }

    // Bağlı listeyi ekrana yazdırma metod
    public void listele() {
        Dugum suanki = bas; // Başlangıç düğümünden başla
        while (suanki != null) {
            System.out.print(suanki.veri + " "); // Düğümün verisini yazdır
            suanki = suanki.sonraki; // Bir sonraki düğüme geç
        }
        System.out.println();
    }
}
