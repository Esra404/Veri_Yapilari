package VizeHazirlik.CiftYonluBagliListe;

public class Dugum {
    int icerik;
    Dugum ileri;
    Dugum geri;
    public Dugum(int icerik){
        this.icerik=icerik;
        this.ileri=null;
        this.geri=null;
    }
}
