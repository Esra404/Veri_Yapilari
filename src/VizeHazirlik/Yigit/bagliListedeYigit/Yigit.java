package VizeHazirlik.Yigit.bagliListedeYigit;

public class Yigit {
    Eleman ust;
    public Yigit(){
        ust=null;

    }
    boolean bosMu(){
        return ust ==null;
    }
    void push(Eleman yeni){
        yeni.ileri=ust;
        ust=yeni;
    }
    Eleman pop(){
        Eleman e=ust;
        if(!bosMu()){
            ust=ust.ileri;

        }
        return e;
    }
}
