package Jobsheet_7;

import java.util.Scanner;

public class utama22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Tentukan kapasitas Gudang: ");
        int isi = sc.nextInt();

        gudang22 gudang = new gudang22(isi);

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat barang teratas");
            System.out.println("5. Lihat barang terbawah");
            System.out.println("6. Cari barang");
            System.out.println("7. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = sc.nextLine();
                    barang22 barangBaru = new barang22(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;

                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    System.out.println("Masukkan\n1.Nama barang\n2.Kode barang");
                    int pilih = sc.nextInt();
                    if (pilih == 1) {
                        System.out.print("Masukkan nama barang: ");
                        String brg = sc.next();
                        String hasil = gudang.cariNamaBarang(brg);
                        if (hasil.equals(null)) {
                            System.out.println("Barang tidak tersedia.");
                        } else{
                            System.out.println("Barang " + hasil + " Tersedia.");
                        }
                    } else if(pilih == 2){
                        System.out.print("Masukkan kode barang: ");
                        int kodeBrg = sc.nextInt();
                        int hasilKode = gudang.cariKodeBarang(kodeBrg);
                        if (hasilKode == 0) {
                            System.out.println("Barang tidak tersedia.");
                        } else{
                            System.out.println("Barang " + hasilKode + " Tersedia.");
                        }
                    } else{
                        System.out.println("Tolong pilih 1 atau 2");
                    }
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid silahkan coba lagi.");
                    break;
            }
        }

    }
}
