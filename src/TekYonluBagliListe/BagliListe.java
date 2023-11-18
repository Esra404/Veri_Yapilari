package TekYonluBagliListe;

public class BagliListe {

    Eleman bas;
    Eleman son;
    public BagliListe(){
        bas=null;
        son=null;
    }
    public void basaEkle(Eleman yeni){
        if(son==null){
            bas=yeni;
            son=yeni;
        }else{
            yeni.ileri=bas;
            bas=yeni;
        }
    }
    void sonaEkle(Eleman yeni){
        if(bas==null){
            bas=yeni;
            son=yeni;
        }
        else{
            son.ileri=yeni;
            son=yeni;
        }
    }



}
