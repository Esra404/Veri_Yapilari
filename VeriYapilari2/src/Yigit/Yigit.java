package Yigit;

public class Yigit {
    private int boyut;
    private int[] dizi;
    private int ust;

    // Yığın boyutunu belirleyen yapılandırıcı metod
    public Yigit(int boyut) {
        this.boyut = boyut;
        this.dizi = new int[boyut];
        this.ust = -1; // Yığıt boş olduğu için üst değerini -1 olarak başlatıyoruz
    }

    // Yığıta eleman ekleme metod
    public void ekle(int eleman) {
        if (ust == boyut - 1) {
            System.out.println("Yığın dolu, eleman eklenemedi.");
        } else {
            dizi[++ust] = eleman;
            System.out.println(eleman + " yığına eklendi.");
        }
    }

    // Yığıttan eleman çıkarma metod
    public int cikar() {
        if (ust == -1) {
            System.out.println("Yığın boş, eleman çıkarılamaz.");
            return -1;
        } else {
            int eleman = dizi[ust--];
            System.out.println(eleman + " çıkarıldı.");
            return eleman;
        }
    }

    // Yığının en üstündeki elemanı gösteren metod
    public int ustEleman() {
        if (ust == -1) {
            System.out.println("Yığın boş.");
            return -1;
        } else {
            return dizi[ust];
        }
    }

    // Yığının boş olup olmadığını kontrol eden metod
    public boolean bosMu() {
        return (ust == -1);
    }
}
