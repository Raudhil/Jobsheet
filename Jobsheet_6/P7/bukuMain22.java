package Jobsheet_6.P7;

import java.util.Scanner;

public class bukuMain22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        pencarianBuku22 data = new pencarianBuku22();
        int jumBuku = 5;

        System.out.println("-------------------------------------------------");
        System.out.println("Masukkan data Buku secara Urut dari KodeBuku Terkecil: ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("--------------");
            System.out.print("Kode Buku \t: ");
            int kodeBuku = sc.nextInt();
            System.out.print("Judul buku \t: ");
            String judulBuku = sc2.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit = sc.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = sc2.nextLine();
            System.out.print("Stock \t: ");
            int stock = sc.nextInt();

            buku22 m = new buku22(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
            
        }

        System.out.println("-------------------------------------------------");
        System.out.println("Data keseluruhan Buku: ");
        data.tampil();

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Pencarian Data: ");
        System.out.println("Masukkan kode buku yang dicari: ");
        System.out.print("Kode Buku: ");
        int cari = sc.nextInt();
        System.out.println("Menggunakan sequential Search");
        int posisi = data.findSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
        System.out.println("================================");
        buku22 dataBuku = data.findBuku(cari);
        // if (dataBuku == null) {
        //     System.out.println("Kode Buku Tidak Tersedia");
        // } else{
        //     dataBuku.tampilDataBuku();
        // }

        System.out.println();
        System.out.println("================================");
        System.out.println("Menggunakan binary Search");
        posisi = data.findBinarySearch(cari, 0, jumBuku - 1);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
    }
}
