package CiftBagliListeler;

public class Eleman {
    int veri;
    Eleman ileri;
    Eleman geri;

    public Eleman(int sayi) {
        this.veri = sayi;
        ileri = null;
        geri = null;
    }
}

