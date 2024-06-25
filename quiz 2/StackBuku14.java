public class StackBuku14 {
    private Buku14[] stack;
    private int top;
    private int maxSize;

    public StackBuku14(int ukuran) {
        maxSize = ukuran;
        stack = new Buku14[maxSize];
        top = -1;
    }

    public void push(Buku14 buku) {
        if (top < maxSize - 1) {
            stack[++top] = buku;
            System.out.println("Buku berhasil ditambahkan.");
        } else {
            System.out.println("Stack penuh, tidak bisa menambah buku.");
        }
    }

    public Buku14 pop() {
        if (top >= 0) {
            Buku14 buku = stack[top];
            stack[top--] = null;
            System.out.println("Buku " + buku.getJudul() + " berhasil dihapus.");
            return buku;
        } else {
            System.out.println("Stack kosong, tidak ada buku untuk dihapus.");
            return null;
        }
    }

    public Buku14 peek() {
        if (top >= 0) {
            return stack[top];
        } else {
            System.out.println("Stack kosong, tidak ada buku untuk dilihat.");
            return null;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void cetakSemuaBuku() {
        if (top >= 0) {
            for (int i = 0; i <= top; i++) {
                System.out.println(stack[i]);
                System.out.println("--------------------");
            }
        } else {
            System.out.println("Stack kosong.");
        }
    }

    public Buku14[] getStack() {
        return stack;
    }

    public int getTop() {
        return top;
    }
}
