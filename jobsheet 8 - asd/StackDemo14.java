public class StackDemo14 {
    public static void main(String[] args) {
        Stack14 stack = new Stack14(10);
        stack.push(8);
        stack.push(12);
        stack.push(18);
        stack.print();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.push(-5);
        stack.print();
    }
}
