package Jobsheet_2;

public class bukuMain {
    public static void main(String[] args) {
        
        buku22 buku1 = new buku22();
        buku1.judul = "Today Ends Tomorrow Comes";
        buku1.pengarang = "Denanda Pratiwi";
        buku1.halaman = 198;
        buku1.stok = 13;
        buku1.harga = 71000;

        // buku1.tampilInformasi();
        buku1.terjual(5);
        buku1.gantiHarga(60000);
        buku1.hitungHargaTotal(60000, 5);
        buku1.hitungDiskon();
        buku1.tampilInformasi();
        buku1.hitungHargaBayar();

        // buku22 buku2 = new buku22("Self Reward","Maheera Ayesha",160,29,59000);
        // buku2.terjual(11);
        // buku2.tampilInformasi();

        // buku22 bukuRaul = new buku22("Si Belalang","Raudhil",110,5,2000000);



    }
}
