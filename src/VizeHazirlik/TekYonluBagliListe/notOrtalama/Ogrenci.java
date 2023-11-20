package VizeHazirlik.TekYonluBagliListe.notOrtalama;


public class Ogrenci {
    String isim;
    int not;
    Ogrenci ileri;

    public Ogrenci(String isim,int not){
        this.isim=isim;
        this.not=not;
        this.ileri=null;
    }
}
