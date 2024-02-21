package Jobsheet_2;

public class bukuMain {
    public static void main(String[] args) {
        
        buku22 buku1 = new buku22();
        buku1.judul = "Today Ends Tomorrow Comes";
        buku1.pengarang = "Denanda Pratiwi";
        buku1.halaman = 198;
        buku1.stok = 13;
        buku1.harga = 71000;

        buku1.tampilInformasi();
        buku1.terjual(5);
        buku1.gantiHarga(60000);
        buku1.tampilInformasi();



    }
}
