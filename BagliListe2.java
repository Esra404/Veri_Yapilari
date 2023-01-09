class Eleman{
    int icerik;
    eleman ileri;
    public elelman (int icerik)
    this.icerik=icerik;
    ileri=null;
    }




    class liste{
        eleman bas;

        eleman son;
        punlic liste(){
            bas=null;
            son=null;

        }
        void basaEkle(eleman e ){
            if(son==null){
                bas=e;
                son=e;
            }
            else{
                e.ileri=bas;
                bas=e;
            }
        }
    }
    public class BagliListe2{
        public static void main(String [] args){
            liste l1=new liste():
            l1.basaEkle(new eleman(5));
            l1.basaEkle(new eleman(12));
            l1.basaEkle(new eleman(2));
            l1.basaEkle(new eleman(7));
            eleman tmp=l1.bas;
            while (tmp!=null){
                Sytem.out.print(tmp.icerik+"-->");
                tmp=tmp.ileri;
            }

            
        }
    }