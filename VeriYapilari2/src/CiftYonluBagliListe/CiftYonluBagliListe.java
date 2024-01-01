package CiftYonluBagliListe;

public class CiftYonluBagliListe {
    Dugum bas; // Bağlı listenin başlangıç düğümü

    // Yeni bir düğümü listenin başına ekleme metod
    public void basaEkle(int veri) {
        Dugum yeniDugum = new Dugum(veri); // Yeni düğüm oluştur
        yeniDugum.sonraki = bas; // Yeni düğümün sonraki referansını mevcut baş düğüme ata

        if (bas != null) {
            bas.onceki = yeniDugum; // Mevcut baş düğümün önceki referansını yeni düğüme ata
        }

        bas = yeniDugum; // Yeni düğümü baş düğüm olarak belirle
    }

    // Çift yönlü bağlı listeyi ekrana yazdırma metod
    public void listele() {
        Dugum suanki = bas; // Başlangıç düğümünden başla
        while (suanki != null) {
            System.out.print(suanki.veri + " "); // Düğümün verisini yazdır
            suanki = suanki.sonraki; // Bir sonraki düğüme geç
        }
        System.out.println();
    }
}
