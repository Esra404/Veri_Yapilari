package TekBagliListeler;

public class BagliListe {
    Node head;
    int es;
    //kuyruğa ekleme---n yeni düğüm
    public BagliListe(){
        head=null;
        es=0;
    }
    public void add(Node n){
        if(head == null){
            head =n;
        }else{
            Node tmp=head;
            while(tmp.next !=null){
                tmp =tmp.next;
            }
            tmp.next=n;
        }
    }
    public void print(){
        System.out.println(this.head);
    }


}
