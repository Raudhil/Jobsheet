package Jobsheet_5.jobsheet5;

import java.util.Scanner;

public class hotelMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int harga = 0;

        hotelService list = new hotelService();
        hotel h1 = new hotel("Gahay", "Bandung", 150000, 2);
        hotel h2 = new hotel("Fahay", "Bogor", 120000, 1);
        hotel h3 = new hotel("Lahay", "Semarang", 160000, 4);
        hotel h4 = new hotel("Tahay", "Jakarta", 250000, 5);
        hotel h5 = new hotel("Kahay", "Medan", 500000, 3);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);

        System.out.println("Data-data hotel yang tersedia");
        list.tampilAll();
        
            System.out.print("Pilih Opsi:\n");
            System.out.println("1. Harga Termurah.\n2. Bintang Tertinggi.\n3. Keluar.");
            harga = sc.nextInt();
            System.out.println();

            switch (harga) {
                case 1:
                System.out.println("Harga Termurah: ");    
                list.bubbleSort();
                    list.tampilAll();
                    break;

                case 2:
                System.out.println("Bintang Tertinggi: ");    
                list.selectionSort();
                    list.tampilAll();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Mohon pilih 1, 2 atau 3.");
                    break;
            }
        }

    }

