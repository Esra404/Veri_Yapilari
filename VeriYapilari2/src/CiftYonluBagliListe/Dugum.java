package CiftYonluBagliListe;

public class Dugum {
    int veri;
    Dugum onceki;
    Dugum sonraki;

    // Yapıcı metod
    public Dugum(int veri) {
        this.veri = veri;
        this.onceki = null;
        this.sonraki = null;
    }
}
