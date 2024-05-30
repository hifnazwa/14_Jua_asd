import org.w3c.dom.Node;

public class LinkedList14 {
    Node14 head;

    public boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            System.out.print("Isi Linked List: ");
            Node14 currentNode = head;

            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }

            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst(int input) {
        Node14 newNode = new Node14(input, null);

        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int input) {
        Node14 newNode = new Node14(input, null);

        if (isEmpty()) {
            head = newNode;
        } else {
            Node14 currentNode = head;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
        }
    }

    public void insertAfter(int key, int input) {
        Node14 newNode = new Node14(input, null);

        if (!isEmpty()) {
            Node14 currentNode = head;

            do {
                if (currentNode.data == key) {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }

                currentNode = currentNode.next;
            } while (currentNode != null);
        } else {
            System.out.print("Linked List Kosong");
        }
    }

    public void insertBefore(int key, int input){
        Node14 newNode = new Node14(input, null);
        Node14 currentNode = head;
        
        if(currentNode == null) { 
            this.addFirst(input);
            return;
        }
    
        if(currentNode.data == key) { 
            this.addFirst(input);
            return;
        }
    
        while(currentNode.next != null){
            if(currentNode.next.data == key){ 
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                return;
            }
            currentNode = currentNode.next;
        }
    
        System.out.println("Node dengan key " + key + " tidak ditemukan dalam linked list");
    }
    

    public void insertAt(int index, int key) {
        Node14 newNode = new Node14(key, null);

        if (index < 0) {
            System.out.println("Indeks tidak valid");
            return;
        }
        // Insert di awal
        if (index == 0) {
            addFirst(key);
        } else {
            Node14 currentNode = head;
            int currentIndex = 0;

            while (currentNode != null && currentIndex < index - 1) {
                currentNode = currentNode.next;
                currentIndex++;
            }
            // Mengecek apakah indeks yang diminta lebih besar dari ukuran Linked List
            if (currentNode == null) {
                System.out.println("Tidak melenihi ukuran Linked List");
            } else {
                newNode.next = currentNode.next;
                currentNode.next = newNode;
            }
        }
    }

    public int getData (int index){
        Node14  currentNode = head;
        for(int i=0; i > index; i++){
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }
    public int indexOf (int key){
        Node14 currentNode = head;
        int index = 0;
    
        while (currentNode != null && currentNode.data != key){
            currentNode = currentNode.next;
            index++;
        }
        if(currentNode == null){
            return -1;
        }else{
            return index;
        }
    }
    public void removeFirst(){
        if(! isEmpty()){
            head = head.next;
        }else {
            System.out.println("Linked List masih Kosong");
        }
    }
    
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong");
        } else if (head.next == null) {
            head = null;
        } else {
            Node14 currentNode = head;
            while (currentNode.next.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = null;
        }
    }

    public void remove (int key) {
        if(isEmpty()){
            System.out.println("Linked List masih Kosong");
        }else if (head.data == key) {
            removeFirst();
        } else {
            Node14 currentNode = head;
    
            while(currentNode != null){
                if(currentNode.next.data ==key){
                    currentNode.next = currentNode.next.next;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }

    public void removeAt(int index) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
    
        if (index < 0) {
            System.out.println("Indeks tidak valid");
            return;
        }
    
        if (index == 0) {
            removeFirst();
            return;
        }
    
        Node14 prevNode = null;
        Node14 currentNode = head;
        int currentIndex = 0;
    
        while (currentNode != null && currentIndex < index) {
            prevNode = currentNode;
            currentNode = currentNode.next;
            currentIndex++;
        }
    
        if (currentNode == null) {
            System.out.println("Indeks melebihi ukuran linked list");
        } else {
            prevNode.next = currentNode.next.next;
        }
    }
    
}