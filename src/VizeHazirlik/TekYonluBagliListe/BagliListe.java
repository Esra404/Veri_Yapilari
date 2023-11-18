package VizeHazirlik.TekYonluBagliListe;

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

    void sonaEkleme(Eleman yeni) {
        if (bas == null) {
            bas = yeni;
        } else {
            Eleman yedek = bas;
            while (yedek.ileri != null) {
                yedek = yedek.ileri;
            }
            yedek.ileri = yeni; // Döngü bittikten sonra yeni elemanı sona ekle
        }
    }



    public void arayaEkleme(Eleman yeni,int sayi){
        if(bas==null){
            bas =yeni;

        }else{
            Eleman yedek=bas;
            while(yedek.ileri !=null){
                if(yedek.icerik==sayi){
                    break;}
                    yedek=yedek.ileri;
                }
                yeni.ileri=yedek.ileri;
                yedek.ileri=yeni;
            }
        }
        Eleman aranan(int aranan){
        Eleman yedek=bas;
        while(yedek !=null){
            if(yedek.icerik==aranan){
                return yedek;
            }
            yedek =yedek.ileri;
        }
        return null;
        }
        public void bastanSil(){
        bas=bas.ileri;
        if(bas==null){
            son=null;
        }else{
            Eleman temp=bas;
            bas=bas.ileri;
            temp.ileri=null;
            if(bas==null){
                son=null;
            }
        }
        }
        public void sondanSil(){
        Eleman yedek,once;
        yedek=bas;
        once=null;
        while ( yedek != son){
            once=yedek;
            yedek=yedek.ileri;
            if(once == null){
                bas=null;
                son=null;
            }else{
                once.ileri=null;
                son=once;
            }
        }

        }


    }


