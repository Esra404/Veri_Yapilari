package Hash;

public class HashTablosu {
    private int boyut;
    private String[] anahtarlar;
    private String[] degerler;

    // Hash tablosu boyutunu belirleyen yapılandırıcı metod
    public HashTablosu(int boyut) {
        this.boyut = boyut;
        this.anahtarlar = new String[boyut];
        this.degerler = new String[boyut];
    }

    // Anahtarın hash değerini hesaplayan metod
    private int hash(String anahtar) {
        int hash = 0;
        for (int i = 0; i < anahtar.length(); i++) {
            hash = (hash + anahtar.charAt(i)) % boyut;
        }
        return hash;
    }

    // Anahtar ve değer ekleme metod
    public void ekle(String anahtar, String deger) {
        int hashIndex = hash(anahtar);

        while (anahtarlar[hashIndex] != null && !anahtarlar[hashIndex].equals(anahtar)) {
            hashIndex = (hashIndex + 1) % boyut;
        }

        anahtarlar[hashIndex] = anahtar;
        degerler[hashIndex] = deger;
        System.out.println(anahtar + " anahtarıyla " + deger + " değeri eklendi.");
    }

    // Anahtara göre değer getiren metod
    public String getir(String anahtar) {
        int hashIndex = hash(anahtar);

        while (anahtarlar[hashIndex] != null && !anahtarlar[hashIndex].equals(anahtar)) {
            hashIndex = (hashIndex + 1) % boyut;
        }

        return degerler[hashIndex];
    }
}
