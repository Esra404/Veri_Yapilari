package VizeHazirlik.TekYonluBagliListe;



public class Sinav {
    public static void main(String[] args) {
        BagliListe liste=new BagliListe();


        Eleman eleman2=new Eleman(110);
        Eleman eleman1=new Eleman(12);
        Eleman eleman3=new Eleman(123);
        Eleman eleman4=new Eleman(1234);
        Eleman eleman5=new Eleman(126);



        liste.basaEkle(eleman2);
        liste.basaEkle(eleman1);
        liste.sonaEkle(eleman3);
        liste.sonaEkleme(eleman4);
        liste.arayaEkleme(eleman5, 5);
        Eleman bulunan = liste.aranan(110);
        liste.bastanSil();
        liste.sondanSil();
        if (bulunan != null) {
            System.out.println("Aranan eleman bulundu: " + bulunan.icerik);
        } else {
            System.out.println("Aranan eleman bulunamadı.");
        }

        System.out.println(eleman3.icerik + "-->" + eleman4.icerik+"-->"+ eleman2.icerik+"-->"+eleman1.icerik+"-->"+eleman5.icerik);

    }

}
