import ds.SinglyLinkedList;

public class SinglyLinkedListTest {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList=new SinglyLinkedList();
        singlyLinkedList.print();
        System.out.println(singlyLinkedList.size());
        singlyLinkedList.add(10);
        singlyLinkedList.print();
        System.out.println(singlyLinkedList.size());
        singlyLinkedList.add(20);
        singlyLinkedList.print();
        singlyLinkedList.add(30);
        singlyLinkedList.print();
        singlyLinkedList.add(40);
        singlyLinkedList.print();
        singlyLinkedList.add(50);
        singlyLinkedList.print();
        System.out.println(singlyLinkedList.size());
    }
}
