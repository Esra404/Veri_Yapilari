package VizeHazirlik.TekYonluBagliListe.usman;

public class StudentSinv {
    public static void main(String[] args) {
        BagliListeStudent liste=new BagliListeStudent();

        Eleman1 eleman1=new Eleman1(new Student("Esra1","Esra",23));
        Eleman1 eleman2=new Eleman1(new Student("Esra2","Esra",34));
        Eleman1 eleman3=new Eleman1(new Student("Esra3","Esra",56));
        liste.basaEkle(eleman1);
        liste.basaEkle(eleman2);
        liste.sonaEkleme(eleman3);
        liste.print();

    }
}
