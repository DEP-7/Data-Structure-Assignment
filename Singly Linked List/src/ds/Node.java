package ds;

public class Node {
    private int number;
    private Node node;

    public Node(int number, Node node) {
        this.number = number;
        this.node = node;
    }

    public int getNumber() {
        return number;
    }
}
