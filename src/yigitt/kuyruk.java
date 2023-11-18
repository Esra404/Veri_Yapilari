package yigitt;

public class kuyruk {
    ogrenci [] dizi;//dizide boyutunu hep vermen gerekir
    int bas;
    int son;
    int boyut;

    public kuyruk(int boyut ){
        this.boyut=boyut;
        dizi=new ogrenci [boyut];
        bas=0;
        son=0;
    }
    boolean doluMu(){//önemli
        if(bas ==(son+1)%boyut){
            return true;

        }else {
            return false;
        }
    }
    void Ekle(ogrenci yeni){
        if(!doluMu()){
            dizi[son]=yeni;
            son=(son+1)%boyut;

        }

    }
    boolean bosMu(){
        if(bas==son){
            return true;
        }else{
            return false;
        }
    }
    ogrenci kuyruktanSil(){
        ogrenci yedek;
        if(!bosMu()){
            yedek =dizi[bas];
            bas=(bas+1)%boyut;
            return yedek;

        }
        return null;
    }
    void Listele(){
        if(bosMu()){
            System.out.println("kuyruk boş");
        }
        int index=bas;
        while(index!=son){
            if(dizi[index]!=null){
                System.out.println("--"+dizi[index].no+","+dizi[index].isim+"--");
            }
            index=(index+1)%boyut;


        }

    }
}
