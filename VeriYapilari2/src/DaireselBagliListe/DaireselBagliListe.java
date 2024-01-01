package DaireselBagliListe;

public class DaireselBagliListe {
    Dugum bas; // Bağlı listenin başlangıç düğümü

    // Yeni bir düğümü listenin sonuna ekleme metod
    public void sonaEkle(int veri) {
        Dugum yeniDugum = new Dugum(veri); // Yeni düğüm oluştur

        if (bas == null) {
            bas = yeniDugum;
            yeniDugum.sonraki = bas; // Tek elemanlı liste olduğunda düğümün sonraki referansı kendisini gösterir
        } else {
            Dugum temp = bas;
            while (temp.sonraki != bas) {
                temp = temp.sonraki;
            }
            temp.sonraki = yeniDugum; // Yeni düğümü son düğüm olarak ekle
            yeniDugum.sonraki = bas; // Yeni düğümün sonraki referansı başlangıç düğümünü gösterir
        }
    }

    // Dairesel bağlı listeyi ekrana yazdırma metod
    public void listele() {
        if (bas != null) {
            Dugum temp = bas;
            do {
                System.out.print(temp.veri + " "); // Düğümün verisini yazdır
                temp = temp.sonraki;
            } while (temp != bas); // Başa geri dönünceye kadar devam et
            System.out.println();
        } else {
            System.out.println("Liste boş");
        }
    }

}
