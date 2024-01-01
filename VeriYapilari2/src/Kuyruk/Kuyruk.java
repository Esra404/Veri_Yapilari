package Kuyruk;

public class Kuyruk {
    private int boyut;
    private int[] dizi;
    private int bas, son, elemanSayisi;

    // Kuyruk boyutunu belirleyen yapılandırıcı metod
    public Kuyruk(int boyut) {
        this.boyut = boyut;
        this.dizi = new int[boyut];
        this.bas = 0;
        this.son = -1;
        this.elemanSayisi = 0;
    }

    // Kuyruğa eleman ekleme metod
    public void ekle(int eleman) {
        if (elemanSayisi == boyut) {
            System.out.println("Kuyruk dolu, eleman eklenemedi.");
        } else {
            if (son == boyut - 1) {
                son = -1;
            }
            dizi[++son] = eleman;
            elemanSayisi++;
            System.out.println(eleman + " kuyruğa eklendi.");
        }
    }

    // Kuyruktan eleman çıkarma metod
    public int cikar() {
        if (elemanSayisi == 0) {
            System.out.println("Kuyruk boş, eleman çıkarılamaz.");
            return -1;
        } else {
            int eleman = dizi[bas++];
            if (bas == boyut) {
                bas = 0;
            }
            elemanSayisi--;
            System.out.println(eleman + " çıkarıldı.");
            return eleman;
        }
    }

    // Kuyruğun en başındaki elemanı gösteren metod
    public int basEleman() {
        if (elemanSayisi == 0) {
            System.out.println("Kuyruk boş.");
            return -1;
        } else {
            return dizi[bas];
        }
    }

    // Kuyruğun boş olup olmadığını kontrol eden metod
    public boolean bosMu() {
        return (elemanSayisi == 0);
    }
}
