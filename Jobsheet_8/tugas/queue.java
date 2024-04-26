package Jobsheet_8.tugas;

public class queue {
    pembeli[] antrian;
    int front, rear, size, max;

    public queue(int n) {
        max = n;
        antrian = new pembeli[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println(
                    "Elemen terdepan: " + "\nNama: " + antrian[front].nama + "\nNo Hp: " + antrian[front].noHp);
                    System.out.println();
        } else {
            System.out.println("Queue Masih Kosong");
            System.out.println();
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println(
                    "Elemen terbelakang: " + "\nNama: " + antrian[rear].nama + "\nNo Hp: " + antrian[rear].noHp);
                    System.out.println();
        } else {
            System.out.println("Queue Masih Kosong");
            System.out.println();
        }
    }

    public void enqueue(pembeli antri) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
            System.exit(0);
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = antri;
            size++;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return front;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(antrian[i].nama + " " + antrian[i].noHp + " \n");
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noHp);
            System.out.println("Jumlah elemen: " + size);
            System.out.println();
        }
    }

    public void daftarPembeli() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong.");
        } else {
            for (int i = front; i < antrian.length; i++) {
                System.out.println("Daftar Pembeli " + (i));
                System.out.println("-----------------------------");
                System.out.println("Nama: " + antrian[i].nama);
                System.out.println("No Hp: " + antrian[i].noHp);
                System.out.println("------------------------------");
                System.out.println();
            }
        }

    }

    public void peekPosition(String nama){
        int position = 0;
        while (position != rear + 1) {
            if (antrian[position].nama.equalsIgnoreCase(nama)) {
                System.out.println("Posisi: " + (position + 1));
                break;
            } else {
                position++;
            }
            if (position > rear) {
                System.out.println("Pembeli tidak ditemukan");
            }
        }
        
    }

}
