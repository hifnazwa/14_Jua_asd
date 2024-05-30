public class DoubleLinkedListVaksin14 {
  
    NodeVaksin14 head;
    int size;

    public DoubleLinkedListVaksin14(){
        head = null;
        size = 1;    
    }
    public boolean isEmpty(){
        return head == null;
    }

    public void addLast(int nomor, String nama){
        if (isEmpty()){
            head = new NodeVaksin14(null, nomor, nama, null);
        } else {
            NodeVaksin14 current = head;
            while (current.next != null){
                current = current.next;
            }
            NodeVaksin14 newNodeVaksin = new NodeVaksin14(current, nomor, nama, null);
            current.next = newNodeVaksin;
            size++;
        }
    }
    
    public void removeFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List Masih kosong, tidak dapat dihapus!");
        }else if (size == 1){
            removeLast();
        }else{
            System.out.println(head.nama+" Sudah Di Vaksin");
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void removeLast() throws Exception {
        if(isEmpty()){
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        }else if (head.next == null){
            System.out.println(head.nama+" Sudah Di Vaksin");
            head = null;
            size--;
            return;
        }
         NodeVaksin14 current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }
    public void print(){
        System.out.println("+++++++++++++++++++++++++");
        System.out.println(" DAFTAR PENGANTRI Vaksin ");
        System.out.println("+++++++++++++++++++++++++"); 
        System.out.println("| No\t| Nama"+"\t|");
        if(!isEmpty()){
            NodeVaksin14 tmp = head;
            while (tmp != null){
                System.out.print("| "+tmp.nomor+"\t| "+tmp.nama+" "+"\t|\n");
                tmp = tmp.next;
            }
            System.out.println("\nSisa Antrian "+size);
        }else{
            System.out.println("Linked List Kosong");
        }
    }
}