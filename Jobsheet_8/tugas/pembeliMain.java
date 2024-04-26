package Jobsheet_8.tugas;

import java.util.Scanner;

public class pembeliMain {

    public static void menu() {
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Cek antrian terbelakang");
        System.out.println("6. Cari nama");
        System.out.println("7. Daftar seluruh pembeli");
        System.out.println("8. Exit");
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();
        queue antri = new queue(jumlah);
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            System.out.println();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Nomor HP: ");
                    int noHp = sc.nextInt();
                    pembeli dt = new pembeli(nama, noHp);
                    sc.nextLine();
                    antri.enqueue(dt);
                    break;
                case 2:
                    int data = antri.dequeue() - 1;
                    System.out.println("Antrian yang keluar posisi: " + 
                    data + 1);
                    System.out.println("Nama: " + antri.antrian[data].nama + "\nNomor HP: " + antri.antrian[data].noHp);
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
                case 6:
                    System.out.print("Cari nama yang ingin dicari: ");
                    nama = sc.nextLine();
                    antri.peekPosition(nama);
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Daftar seluruh pembeli: ");
                    antri.daftarPembeli();
                    break;
                case 8:
                System.exit(0);
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
}
