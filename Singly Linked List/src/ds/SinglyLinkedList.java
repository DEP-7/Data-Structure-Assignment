package ds;

public class SinglyLinkedList {
    private Node node;

    public void add(int number) {
        if (node == null) {
            node = new Node(number, null);
        }
    }

    public void add(int index, int number) {

    }

    public void remove(int index) {

    }

    public int get(int index) {
        return 0;
    }

    public void print() {
        while (node != null) {
            System.out.println(node.getNumber());
        }
    }

    public void clear() {

    }

    public int size() {
        return 0;
    }

    public boolean contains(int number) {
        return false;
    }

    public boolean empty() {
        return false;
    }
}
