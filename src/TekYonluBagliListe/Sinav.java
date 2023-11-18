package TekYonluBagliListe;



public class Sinav {
    public static void main(String[] args) {
        BagliListe liste=new BagliListe();


        Eleman eleman2=new Eleman(110);
        Eleman eleman1=new Eleman(12);
        Eleman eleman3=new Eleman(123);

        liste.basaEkle(eleman2);
        liste.basaEkle(eleman1);
        liste.sonaEkle(eleman3);

        System.out.println(eleman3.icerik + "-->" + eleman1.icerik+"-->"+ eleman2.icerik);

    }

}
