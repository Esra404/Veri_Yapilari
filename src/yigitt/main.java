package yigitt;

public class main {
    public static void main(String[] args) {
        //dizi yada bağlı lite ile oluşturabiliriz
        kuyruk Kuyruk =new kuyruk(5);
        ogrenci yeni=new ogrenci(123,"ali");
        ogrenci yeni2=new ogrenci(345,"ahmet");

        Kuyruk.Ekle(yeni);
        Kuyruk.kuyruktanSil();
        Kuyruk.Listele();
        Kuyruk.kuyruktanSil();
        System.out.println("-----------------------------");
        Kuyruk.Listele();

    }
}
