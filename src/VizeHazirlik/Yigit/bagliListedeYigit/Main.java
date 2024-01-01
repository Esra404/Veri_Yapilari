package VizeHazirlik.Yigit.bagliListedeYigit;

import VizeHazirlik.Yigit.diziİleOrnek.Stack;

public class Main {
    public static void main(String[] args) {
        Yigit yigit = new Yigit();

        // Elemanlar oluşturuluyor
        Eleman eleman1 = new Eleman(5);
        Eleman eleman2 = new Eleman(10);
        Eleman eleman3 = new Eleman(15);

        // Elemanları yığıta ekliyoruz
        //Eleman eleman = yigit.push(12);
        yigit.push(eleman1);
        yigit.push(eleman2);
        yigit.push(eleman3);

     //   System.out.println("Çıkarılan Eleman: " + eleman.icerik);
        // Yığıt boş olmadığı sürece elemanları çıkarıyoruz ve ekrana yazdırıyoruz
       // while (!yigit.bosMu()) {
        //    Eleman eleman = yigit.pop();
          //  System.out.println("Çıkarılan Eleman: " + eleman.icerik);
        }
    }
//}
