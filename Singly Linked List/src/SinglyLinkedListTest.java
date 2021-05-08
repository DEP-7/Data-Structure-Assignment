import ds.SinglyLinkedList;

public class SinglyLinkedListTest {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList=new SinglyLinkedList();
        System.out.println(singlyLinkedList.contains(60));
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

        System.out.println(singlyLinkedList.contains(10));
        System.out.println(singlyLinkedList.contains(20));
        System.out.println(singlyLinkedList.contains(30));
        System.out.println(singlyLinkedList.contains(45));
        System.out.println(singlyLinkedList.contains(50));
        System.out.println(singlyLinkedList.contains(60));
        System.out.println(singlyLinkedList.size());
    }
}
