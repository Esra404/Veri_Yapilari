package Yigit;

public class Main {
    public static void main(String[] args) {
        Yigit yigit = new Yigit(5);

        yigit.ekle(10);
        yigit.ekle(20);
        yigit.ekle(30);

        System.out.println("Üstteki eleman: " + yigit.ustEleman());

        yigit.cikar();
        yigit.cikar();

        System.out.println("Yığın boş mu? " + yigit.bosMu());
    }

    }

