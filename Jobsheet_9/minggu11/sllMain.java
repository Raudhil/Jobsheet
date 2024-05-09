package Jobsheet_9.minggu11;

public class sllMain {
    public static void main(String[] args) {
        singleLinkedList sll = new singleLinkedList();
        sll.print();
        sll.addFirst(890);
        sll.print();
        sll.addLast(760);
        sll.print();
        sll.addFirst(700);
        sll.print();
        sll.insertAfter(700, 999);
        sll.print();
        sll.insertAt(3, 833);
        sll.print();
        
        System.out.println();
        System.out.println("Data pada indeks ke-1 adalah: " + sll.getData(1));
        System.out.println("Data 3 berada pada indeks ke-" + sll.indexOf(760));
        System.out.println();

        sll.remove(999);
        sll.print();
        sll.removeAt(0);
        sll.print();
        sll.removeFirst();
        sll.print();
        sll.removeLast();
        sll.print();
    }
}
