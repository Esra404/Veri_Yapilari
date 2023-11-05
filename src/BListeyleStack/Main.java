package BListeyleStack;

public class Main {


    public static void main(String[] args) {
        Yigit Y = new Yigit();
        Eleman yeni = new Eleman(9);
        Y.push(yeni);
        Eleman yeni1 = new Eleman(18);
        Y.push(yeni1);
        Eleman yeni2 = new Eleman(3);
        Y.push(yeni2);
        Eleman yeni3 = new Eleman(17); //son eklenen eleman
        Y.push(yeni3);
        Y.listele();
        System.out.println("--------------------------------");
        Y.pop();
        Y.listele();
    }


}
