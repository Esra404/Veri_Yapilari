package VizeHazirlik.TekYonluBagliListe.notOrtalama;

public class BagliListe {
    Ogrenci bas;

    public BagliListe() {
        this.bas = null;
    }

    public void ogrenciEkle(String isim, int not) {
        Ogrenci yeniOgrenci = new Ogrenci(isim, not);
        if (bas == null) {
            bas = yeniOgrenci;
        } else {
            Ogrenci gecerli = bas;
            while (gecerli.ileri != null) {
                gecerli = gecerli.ileri;
            }
            gecerli.ileri = yeniOgrenci;
        }
    }

    public double notOrtalamaHesaplama() {
        if (bas == null) {
            return 0;

        }
        double toplam=0;
        int ogrenciSayisi=0;
        Ogrenci gecerli=bas;
        while (gecerli != null){
            toplam +=gecerli.not;
            ogrenciSayisi++;
            gecerli=gecerli.ileri;
    }
        double ortalama =toplam/ogrenciSayisi;
        return ortalama;

}
}
