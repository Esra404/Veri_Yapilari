package VizeHazirlik.TekYonluBagliListe.ornek1;

public class Main {


        public static void main(String[] args) {
            bagliListe liste = new bagliListe();
            liste.basaEkle(2);
            liste.basaEkle(1);
            liste.sonaEkle(3);
            liste.sonaEkle(4);
            liste.arayaEkle(2, 2);
            liste.yazdir(); // 1 2 2 3 4

            liste.bastanSil();
            liste.yazdir(); // 2 2 3 4

            liste.sondanSil();
            liste.yazdir(); // 2 2 3
        }
    }

