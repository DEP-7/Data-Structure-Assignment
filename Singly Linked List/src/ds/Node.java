package ds;

public class Node {
    private int number;
    private Node node;

    public Node(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }
}
