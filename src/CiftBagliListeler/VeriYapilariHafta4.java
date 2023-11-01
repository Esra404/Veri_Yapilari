package CiftBagliListeler;

public class VeriYapilariHafta4 {
    public static void main(String[] args) {
        CiftBagliListe liste1 = new CiftBagliListe();
        Eleman eleman1 = new Eleman(5);
        Eleman eleman2 = new Eleman(23);
        Eleman eleman3 = new Eleman(13);
        Eleman eleman4 = new Eleman(9);
        Eleman eleman5 = new Eleman(7);
        Eleman eleman6 = new Eleman(15);

        liste1.basaEkle(eleman1);
        liste1.sonaEkle(eleman2);
        liste1.basaEkle(eleman4);
        liste1.sonaEkle(eleman3);
        liste1.basaEkle(eleman5);
        liste1.sonaEkle(eleman6);

        liste1.listele();

        liste1.bastanSil();
        liste1.listele();

        liste1.sondanSil();
        liste1.listele();
    }
}
