package Kuyruk;

public class Main {
    public static void main(String[] args) {
        Kuyruk kuyruk = new Kuyruk(5);

        kuyruk.ekle(10);
        kuyruk.ekle(20);
        kuyruk.ekle(30);

        System.out.println("Başta bulunan eleman: " + kuyruk.basEleman());

        kuyruk.cikar();
        kuyruk.cikar();

        System.out.println("Kuyruk boş mu? " + kuyruk.bosMu());

    }
}
