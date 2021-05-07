package ds;

public class SinglyLinkedList {
    private Node node;

    public void add(int number) {
        if (empty()) {
            node = new Node(number);
        } else {
            Node tempNode = node;
            for (int i = 0; i < size()-1; i++) {
                tempNode = tempNode.getNode();
            }
            tempNode.setNode(new Node(number));
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
            for (int i = 0; i < size(); i++) {
                System.out.print(tempNode.getNumber()+", ");
                tempNode = tempNode.getNode();
            }
            System.out.println("\b\b]");
        }
    }

    public void clear() {

    }

    public int size() {
        if (empty()){
            return 0;
        }
        int count =0;
        Node tempNode=node;
        while (true) {
            if (tempNode == null) {
                return count;
            }
            count++;
            tempNode = tempNode.getNode();
        }
    }

    public boolean contains(int number) {
        return false;
    }

    public boolean empty() {
        return node == null;
    }
}
