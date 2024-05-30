import java.util.Scanner;

import org.w3c.dom.Node;

/**
 * ScavengerHuntGame14
 */
public class ScavengerHunt14 {
    private NodeGame14 head;

    public ScavengerHunt14() {
        head = null;
    }

    public void addNode(String question, String answer) {
        if (head == null) {
            head = new NodeGame14(question, answer);
        } else {
            NodeGame14 current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new NodeGame14(question, answer));
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        NodeGame14 current = head;
        while (current != null) {
            System.out.println(current.getQuestion());
            String answer = scanner.nextLine();
            if (current.getAnswer().equalsIgnoreCase(answer)) {
                System.out.println("Benar! Lanjut ke pertanyaan selanjutnya...");
                current = current.getNext();
            } else {
                System.out.println("SALAH! Game over.");
                break;
            }
        }
        if (current == null) {
            System.out.println("Selamat! Anda telah menjawab seluruh pertanyaan");
        }
        scanner.close();
    }
    
}