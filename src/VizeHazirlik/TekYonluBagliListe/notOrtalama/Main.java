package VizeHazirlik.TekYonluBagliListe.notOrtalama;

public class Main {
    public static void main(String[] args) {
        BagliListe liste=new BagliListe();
        liste.ogrenciEkle("esra",90);
        liste.ogrenciEkle("ali",20);
        liste.ogrenciEkle("eda",40);
        liste.ogrenciEkle("emir",60);
        liste.ogrenciEkle("emre",40);

        double notOrtalamasi= liste.notOrtalamaHesaplama();
        System.out.println("öğrenci not ortalaması="+notOrtalamasi);
    }

}
