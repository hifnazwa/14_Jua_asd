public class DoubleLinkedListMain14 {
    public static void main(String[] args) throws Exception {
        
        DoubleLinkedList14 dll = new DoubleLinkedList14();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=========================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=========================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " +dll.size());
        System.out.println("=========================================");
        dll.clear();
        dll.print();
        System.out.println("Size : "+ dll.size());
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size  : " +dll.size() );
        System.out.println("=========================================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=========================================");
        dll.removeLast();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=========================================");
        dll.remove(1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=========================================");
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=========================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=========================================");
        System.out.println("Data awal pada linked lists adalah: " + dll.getFirst());
        System.out.println("Data akhir pada Linked Lists adalah: " + dll.getLast());
        System.out.println("Data indeks ke ke-1 pada linked lists adalah: " + dll.get(1));
        System.out.println("=========================================");
    }
    
}
