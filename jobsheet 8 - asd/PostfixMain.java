import java.util.Scanner;

public class PostfixMain {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan ekspresi matematika (infix): ");
        Q = sc14.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();

        postfix14 post = new postfix14(total);
        P = post.konversi(Q);
        System.out.println("Posttix: " + P);

    }
}
