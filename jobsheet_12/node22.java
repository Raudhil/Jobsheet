package jobsheet_12;

public class node22 {
    int data;
    node22 prev, next;
    int jarak;

    node22(node22 prev, int data ,int jarak, node22 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }
}