package ds;

public class SinglyLinkedList {
    private Node node;

    public void add(int number) {
        if (node == null) {
            node = new Node(number, null);
        } else {

            Node tempNode = node;
            while (true) {
                //System.out.println("Check while loop");
                if (tempNode.getNode() == null) {
                    //System.out.println("if condition execute");
                    tempNode.setNode(new Node(number, null));
                    //System.out.println(tempNode.getNumber());
                    return;
                }
                tempNode = tempNode.getNode();
            }
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
        if (empty()) {
            System.out.println("[]");
        }else {
            System.out.print("[");
            Node tempNode = node;
            while (true) {
                if (tempNode == null) {
                    break;
                }
                System.out.print(tempNode.getNumber()+", ");
                tempNode = tempNode.getNode();
            }
            System.out.println("\b\b]");
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
        return node == null;
    }
}
