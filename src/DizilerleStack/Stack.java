package DizilerleStack;

public class Stack {
    int ust;
    int kapasite;
    int[] dizi;

    public Stack(int kapasite) {
        this.kapasite = kapasite;
        ust = - 1;
        dizi = new int[kapasite];
    }

    public void listele() {
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i]+" --> ");
        }
    }

    boolean doluMu(){
        // alttaki şekilde de yazılabilir ancak daha uzun olduğu için alttaki tercih edilir
        // if(ust == kapasite - 1){
        //     return true;
        // }else{
        //     return false;
        // }
        return (ust == kapasite - 1);
    }

    boolean bosMu(){
        return (ust == - 1);
    }

    void push(int sayi) {//Eleman eklemek için kullanılan metot
        if(!doluMu()){
            ust = ust + 1;
            dizi[ust] = sayi;
            System.out.println("Eklenen sayı: "+sayi);
        }else{
            System.out.println("Stack dolu");
        }
    }

    int pop() {//Eleman çıkarmak için kullanlınan metot
        if(!bosMu()){
            ust = ust - 1;
            System.out.println("Çıkarılan sayı: "+dizi[ust+1]);
            return dizi[ust+1];
        }else{
            System.out.println("Stack boş");
            return -1;
        }
    }
}


