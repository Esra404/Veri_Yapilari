package TekBagliListeler;

public class BagliListeimlp {
    public static void main(String[] args) {
        TekBagliListeler.BagliListe b1=new TekBagliListeler.BagliListe();
        Node n1=new Node(5);
        Node n2=new Node(15);
        Node n3=new Node(35);
        Node n4=new Node(25);
        Node n5=new Node(2);


        b1.print();
        b1.addInOrder(n1);
        b1.print();
        b1.addInOrder(n2);
        b1.print();
        b1.addInOrder(n3);
        b1.print();
        b1.addInOrder(n4);
        b1.print();
        b1.addInOrder(n5);
        b1.print();
        b1.delete(25);
        b1.print();


    }






}
