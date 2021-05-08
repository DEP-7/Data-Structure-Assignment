import ds.SinglyLinkedList;

public class SinglyLinkedListTest {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList=new SinglyLinkedList();
        singlyLinkedList.print();
        singlyLinkedList.add(0,10);
        singlyLinkedList.print();
        singlyLinkedList.add(20);
        singlyLinkedList.print();
        singlyLinkedList.add(30);
        singlyLinkedList.print();
        singlyLinkedList.add(40);
        singlyLinkedList.print();
        singlyLinkedList.add(50);
        singlyLinkedList.print();
        singlyLinkedList.add(2,25);
        singlyLinkedList.print();
        singlyLinkedList.remove(2);
        singlyLinkedList.print();
        System.out.println(singlyLinkedList.get(0));
        System.out.println(singlyLinkedList.get(1));
        System.out.println(singlyLinkedList.get(2));
        System.out.println(singlyLinkedList.get(3));
        System.out.println(singlyLinkedList.size());
    }
}
