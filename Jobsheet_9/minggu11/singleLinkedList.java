package Jobsheet_9.minggu11;

public class singleLinkedList {
    Node head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
        } else {
            Node tmp = head;
            System.out.println("Isi Linked List: ");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        }
    }

    void addFirst(int input) {
        Node ndInput = new Node(input, null);

        if (isEmpty()) {
            head = tail = ndInput;
            ndInput = head;
        } else {
            ndInput.next = head;
            head = ndInput;
            tail = ndInput;
        }
    }

    void addLast(int input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            tail = tail.next = ndInput;
        } else {
            tail.next = ndInput;

        }
    }

    void insertAfter(int key, int input) {
        Node ndInput = new Node(input, null);
        Node tmp = head;
        do {
            if (tmp.data == key) {
                ndInput.next = tmp.next;
                tmp.next = ndInput;
                if (ndInput.next != null) {
                    tail = ndInput;
                    break;
                }
            }
            tmp = tmp.next;
        } while (tmp != head);
    }

    void insertAt(int index, int input) {
        Node ndInput = new Node(input, null);
        if (index < 0) {
            System.out.println("Perbaiki logikanya!" + " Kalau indeksnya -1 bagaimana???");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            tmp.next = new Node(input, tmp.next);
            if (tmp.next.next == null) {
                tail = tmp.next;
            }
        }
    }

    int getData(int index) {
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    int indexOf(int key) {
        Node tmp = head;
        int index = 0;
        while (tmp != null) {
            tmp = tmp.next;
            index++;
        }
        if (tmp != null) {
            return 1;
        } else {
            return index;
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak bisa di hapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak bisa dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node tmp = head;
            Node prev = null;
            while (tmp.next != null) {
                prev = tmp;
                tmp = tmp.next;
            }
            
            if (prev != null) {
                prev.next = null;
                tail = prev;
            } else {
                head = tail = null;
            }
        }
    }
    

    void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak bisa di hapus");
        } else {
            Node tmp = head;
            while (tmp != null) {
                if (tmp.data == key && tmp == head) {
                    removeFirst();
                    break;
                } else if (tmp.next.data == key) {
                    tmp.next = tmp.next.next;
                    if (tmp.next == null) {
                        tail = tmp;
                    }
                    break;
                }
                tmp = tmp.next;
            }
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node tmp = head;
            for (int i = 0; i < index - 1; i++) {
                tmp = tmp.next;
            }
            tmp.next = tmp.next.next;
            if (tmp.next == null) {
                tail = tmp;
            }
        }
    }
}
