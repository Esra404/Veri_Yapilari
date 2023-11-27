package VizeHazirlik.TekYonluBagliListe.labDersi;
/*
public class BListe {
    Eleman bas, son;

    public BListe() {
        bas = null;
        son = null;
    }

    public void basaEkle(Eleman yeni) {
        if (son == null) {
            bas = yeni;
            son = yeni;
        } else {
            son.ileri = bas;
            bas = yeni;
        }
    }

    public void sonaEkle(Eleman yeni) {
        if (bas == null) {
            son = yeni;
            bas = yeni;
        } else {
            son.ileri = yeni;
            yeni = son;
        }
    }


    public Eleman bastanSil() {
        if (bas != null) {
            Eleman tmp = bas;
            bas = bas.ileri;
            if (bas == null) {
                son = null; // Eğer liste boşsa son elemanı da null yap
            }
            return tmp;
        }
        return null; // Eğer liste boşsa null döndür
    }
    public  Eleman sondanSil() {
        Eleman tmp = bas;
        Eleman once = null;
        Eleman silinen = son;
        while (tmp != son) {
            once = tmp;
            tmp = tmp.ileri;
        }
        if (once == null) {
            bas = null;
            son = null;
        }
        return null;
        //else{
          //once.ileri=null;
          ///son=once;
          //return silinen;
        //}
    }
 public Eleman listedenAl(int aranan){
        Eleman tmp=bas;
     // while ()
 }
}*/