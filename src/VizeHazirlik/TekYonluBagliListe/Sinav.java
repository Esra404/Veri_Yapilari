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
//        liste.print();
        liste.basaEkle(eleman1);
//        liste.print();
        liste.sonaEkle(eleman3);
//        liste.print();
        liste.arayaEkleme(eleman5, 1);
//        liste.print();
        liste.sonaEkleme(eleman4);
      //  liste.print();
//        liste.bastanSil();
      //  liste.print();
        liste.print();
      liste.sondanSil();
      liste.print();

//        liste.print();
//
//        liste.arayaEkleme(eleman5, 2);
//        liste.print();
//        Eleman bulunan = liste.aranan(1200);
//        System.out.println(bulunan.icerik);
//        liste.bastanSil();
//        liste.sondanSil();
//        if (bulunan != null) {
//            System.out.println("Aranan eleman bulundu: " + bulunan.icerik);
//        } else {
//            System.out.println("Aranan eleman bulunamadı.");
//        }
//
//        System.out.println(eleman3.icerik + "-->" + eleman4.icerik+"-->"+ eleman2.icerik+"-->"+eleman1.icerik+"-->"+eleman5.icerik);

    }

}
