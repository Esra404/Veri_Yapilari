package CiftBagliListeler;

public class CiftBagliListe {
    Eleman bas;
    Eleman son;

    public void CiftBagliListe() {
        bas = null;
        son = null;
    }

    public void listele() {
        String liste = "";
        String susleme = "";
        Eleman yedek = bas;
        while( yedek != null){
            liste = liste + yedek.veri + "<-->";
            yedek = yedek.ileri;
            susleme += "______";
        }
        System.out.println(susleme);
        System.out.println(liste);
        System.out.println(susleme);
    }

    public void basaEkle(Eleman yeni) {
        if(bas == null) {
            System.out.println("İlk eleman başarıyla değiştirildi: "+yeni.veri);
            bas = yeni;
            son = yeni;
        }else {
            System.out.println("İlk eleman başarıyla değiştirildi: "+yeni.veri);
            yeni.ileri = bas;
            bas.geri = yeni;
            bas = yeni;
        }

    }

    public void arayaEkle(int nereye, Eleman yeni) {
        Eleman yedek = bas;
        while(yedek.veri != nereye) {
            yedek = yedek.ileri;
            if(yedek == null) {
                System.out.println("Eleman yok!");
            }
        }
        if(yedek == son){
            yeni.ileri=null;
            son = yeni;
        }else{
            yeni.ileri = yedek.ileri;
            yedek.ileri.geri = yeni;
        }
        yeni.geri = yedek;
        yedek.ileri = yeni;
    }

    public void sonaEkle(Eleman yeni) {
        if(son == null) {
            System.out.println("Son eleman başarıyla değiştirildi: "+yeni.veri);
            bas = yeni;
            son = yeni;
        }else{
            System.out.println("Son eleman başarıyla değiştirildi: "+yeni.veri);
            son.ileri = yeni;
            yeni.geri = son;
            son = yeni;
        }
    }

    public void bastanSil() {
        if(bas.ileri == null){
            System.out.println("Baştaki eleman başarıyla silindi: "+bas.veri);
            bas = null;
        }else{
            System.out.println("Baştaki eleman başarıyla silindi: "+bas.veri);
            bas = bas.ileri;
            bas.geri = null;
        }
    }

    public void aradanSil(int arananSayi) {
        Eleman yedek = bas;
        if(bas == null){
            System.out.println("Eleman yok!");
        }
        while(yedek.veri != arananSayi){
            yedek = yedek.ileri;
            if(yedek == null){
                System.out.println("Hiç eleman yok");
            }
        }
        if(yedek == bas){
            bas = yedek.ileri;
        }else{
            yedek.geri.ileri = yedek.ileri;
        }
    }

    public void sondanSil() {
        if(son.geri == null){
            System.out.println("Sondaki eleman başarıyla silindi: "+son.veri);
            son = null;
        }else{
            System.out.println("Sondaki eleman başarıyla silindi: "+son.veri);
            son = son.geri;
            son.ileri = null;
        }
    }
}


