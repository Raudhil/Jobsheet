package Jobsheet_5.jobsheet5;

public class hotel {
    String nama,kota;
    int harga;
    int bintang;

    public hotel(String n,String k, int h,int b){
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    void tampil(){
        System.out.println("Nama: " + nama);
        System.out.println("Kota: " + kota);
        System.out.println("Harga: " + harga);
        System.out.println("Bintang: " + bintang);
    }
}
