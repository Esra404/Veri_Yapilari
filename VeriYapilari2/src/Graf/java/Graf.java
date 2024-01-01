package Graf.java;

import java.util.*;

// Grafı temsil eden sınıf
class Graf {
    private int dugumSayisi;
    private LinkedList<Integer>[] komsulukListesi;

    // Yapıcı metod
    public Graf(int dugumSayisi) {
        this.dugumSayisi = dugumSayisi;
        komsulukListesi = new LinkedList[dugumSayisi];
        for (int i = 0; i < dugumSayisi; ++i)
            komsulukListesi[i] = new LinkedList<>();
    }

    // Yeni kenar ekleyen metod
    public void kenarEkle(int baslangic, int hedef) {
        komsulukListesi[baslangic].add(hedef);
        komsulukListesi[hedef].add(baslangic); // Eğer yönlü değilse bu satırı kaldırabilirsiniz.
    }

    // Grafi ekrana yazdıran metod
    public void yazdir() {
        for (int i = 0; i < dugumSayisi; ++i) {
            System.out.println("Düğüm " + i + " ile komşuları: ");
            for (Integer komsu : komsulukListesi[i]) {
                System.out.print(" -> " + komsu);
            }
            System.out.println();
        }
    }
}