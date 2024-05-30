import java.util.LinkedList;

public class SLLMain14 {
    public static void main(String[] args) {
        LinkedList14 MyLinkedsList14 = new LinkedList14();
        MyLinkedsList14.print();
        MyLinkedsList14.addFirst(800);
        MyLinkedsList14.print();
        MyLinkedsList14.addFirst(700);
        MyLinkedsList14.print();
        MyLinkedsList14.addLast(500);
        MyLinkedsList14.print();
        MyLinkedsList14.insertAfter(700, 300);
        MyLinkedsList14.print();
        MyLinkedsList14.insertAt(3, 400);
        MyLinkedsList14.print();
        MyLinkedsList14.insertBefore(300, 450);
        MyLinkedsList14.print();

        System.out.println("Data pada indekx ke-4 : " + MyLinkedsList14.getData(2));
        System.out.println("Data 300 berada pada indeks ke:" + MyLinkedsList14.indexOf(500));

        MyLinkedsList14.remove(300);
        MyLinkedsList14.print();
        MyLinkedsList14.removeFirst();
        MyLinkedsList14.print();
        MyLinkedsList14.removeLast();
        MyLinkedsList14.print();
        MyLinkedsList14.removeAt(1);
        MyLinkedsList14.print();
    }
}