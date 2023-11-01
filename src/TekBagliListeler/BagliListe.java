package TekBagliListeler;

public class BagliListe {
    Node head;
    int es;
    //kuyruğa ekleme---n yeni düğüm
    public BagliListe(){
        head=null;
        es=0;
    }
    //araya eleman ekleme
    public void addInOrder(Node n){//ilk düğümün eklenmesi
        if (head == null){
            head=n;
        }else if(head.data>n.data){//başa eklenmesi
            n.next=head;
            head=n;
        }
        else{// hem sona hem araya eklenmesi
            Node tmp =head;
            while(tmp.next != null && tmp.next.data < n.data){//sadece sona ekleme
                tmp=tmp.next;
            }
            n.next=tmp.next;
            tmp.next=n;
        }
    }
    public void delete(int d){
        if(head==null){
            System.out.println("liste boş");
        }else if(head.data == d){
            head=head.next;
        }else{

            Node tmp=head;
            while(tmp != null){
                if(tmp.next.data ==d){
                    tmp.next=tmp.next.next;
                }
                tmp=tmp.next;
            }
        }
    }


    public void add(Node n){//sona ekle
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
        Node tmp =head;
        while ( tmp != null){
            System.out.println(tmp.data+" - ");
            tmp=tmp.next;
        }
        System.out.println();
    }


}
