package Hash;

public class Main {
    public static void main(String[] args) {
        HashTablosu hashTablosu = new HashTablosu(10);

        hashTablosu.ekle("anahtar1", "deger1");
        hashTablosu.ekle("anahtar2", "deger2");
        hashTablosu.ekle("anahtar3", "deger3");

        System.out.println("anahtar2 anahtarına karşılık gelen değer: " + hashTablosu.getir("anahtar2"));

    }
}
