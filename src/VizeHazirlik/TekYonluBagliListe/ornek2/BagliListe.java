package VizeHazirlik.TekYonluBagliListe.ornek2;

public class BagliListe {
    Dugum bas;
    public void basaEkle(int icerik){

        Dugum yenidugum=new Dugum(icerik);
        yenidugum.ileri=bas;
        bas=yenidugum;

    }
    public void bastanSil(){
        if(bas==null){
            System.out.println("listede silinecek eleman yok");
            return;
        }
        bas=bas.ileri;

    }

    public void listeyazdir(){
        Dugum gecerli=bas;
        while (gecerli !=null){
            System.out.print(gecerli.icerik+"-->");
            gecerli=gecerli.ileri;
            System.out.print( " ");
        }
    }
}
