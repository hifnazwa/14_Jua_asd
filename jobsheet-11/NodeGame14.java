import org.w3c.dom.Node;

public class NodeGame14 {
    private String question;
    private String answer;
    private NodeGame14 next;

    public NodeGame14(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.next = null;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public NodeGame14 getNext() {
        return next;
    }

    public void setNext(NodeGame14 next) {
        this.next = next;
    }
}
