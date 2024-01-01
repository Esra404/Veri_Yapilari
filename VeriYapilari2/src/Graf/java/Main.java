package Graf.java;

// Kullanım örneği
public class Main {
    public static void main(String args[]) {
        int dugumSayisi = 5;
        Graf graf = new Graf(dugumSayisi);

        graf.kenarEkle(0, 1);
        graf.kenarEkle(0, 4);
        graf.kenarEkle(1, 2);
        graf.kenarEkle(1, 3);
        graf.kenarEkle(1, 4);
        graf.kenarEkle(2, 3);
        graf.kenarEkle(3, 4);

        graf.yazdir();
    }
}