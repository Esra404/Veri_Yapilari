
package BagliListeSinav;
import java.util.Scanner;
public class Sinav {
    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);
        int sayi=k.nextInt();
        Eleman bas=new Eleman(sayi);
        Eleman x=new Eleman(4);
        Eleman y=new Eleman(5);
        x.ileri=y;

        bas=bas.ileri;

        for(int i=0;i<9;i++){
            System.out.println("sayi gir");
            sayi=k.nextInt();
            Eleman yeni=new Eleman(sayi);
            yeni.ileri=bas;


        }

    }
}
