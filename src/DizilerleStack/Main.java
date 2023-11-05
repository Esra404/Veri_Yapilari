package DizilerleStack;

public class Main {
    public static void main(String[] args) {
        Stack yigit = new Stack(5);
        yigit.push(5);
        yigit.push(44);
        yigit.push(2);
        yigit.listele();
        yigit.pop();
        yigit.listele(); // pop() kullanıldıktan sonraki listele de son eleman(2) görünüyor ama bir sonraki eleman ekleme işleminde 2 nin yerine yazacağımız için silmiş oluyoruz.
        yigit.push(5);
        yigit.listele();
    }
}
