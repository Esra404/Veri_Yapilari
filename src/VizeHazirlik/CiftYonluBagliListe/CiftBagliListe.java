package VizeHazirlik.CiftYonluBagliListe;

public class CiftBagliListe {
    Dugum bas;

    public void basaEkle(int icerik) {
        Dugum yeniDugum = new Dugum(icerik);
        yeniDugum.ileri = bas;
        yeniDugum.geri = null;
        if (bas != null) {
            bas.geri = yeniDugum;
            bas = yeniDugum;

        }
    }

    public void BastanSil() {
        if (bas == null) {
            System.out.println("silinecek eleman yok");
            return;
        }
        if (bas.ileri != null) {
            bas.ileri.geri = null;
        }
        bas.ileri = bas;
    }

    public void yazdir() {
        Dugum gecerli = bas;
        while (gecerli != null) {
            System.out.print(gecerli.icerik + "-->");
            gecerli = gecerli.ileri;
        }
        System.out.print("null");
    }


}