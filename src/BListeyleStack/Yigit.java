package BListeyleStack;

public class Yigit {
    Eleman ust;

    Yigit(){
        ust = null;
    }

    boolean bosMu() {
        return ust == null;
    }

    void listele() {
        Eleman yedek = ust;

        while (yedek != null) {
            System.out.print(yedek.icerik+"--> ");
            yedek = yedek.ileri;
        }
    }

    void push(Eleman yeni) {
        yeni.ileri = ust;
        ust = yeni;
    }

    Eleman pop() {
        if(!bosMu()){
            Eleman yeni = ust;
            ust = ust.ileri;
            return yeni;
        }else{
            return null;
        }
    }

}
