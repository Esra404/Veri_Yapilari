package VizeHazirlik.Yigit.diziİleOrnek;

public class Main {
    public static void main(String[] args) {
int size=5;
Stack stack=new Stack(size);
        System.out.println("eleman ekleme");
        stack.push(55);
        stack.push(12);
        stack.push(123);
        stack.push(45);
        stack.push(43);

        System.out.println("eleman silme");
        stack.pop();
        stack.pop();
    }
}
