package Jobsheet_2;

public class buku22 {
    
        String judul,pengarang;
        int halaman,stok,harga,hargaTotal;
        double totalDiskon,diskon;

        
        void tampilInformasi(){
            System.out.println("Judul: " + judul);
            System.out.println("Pengarang: " + pengarang);
            System.out.println("Jumlah halaman: " + halaman);
            System.out.println("Sisa stok: " + stok);
            System.out.println("Harga: Rp " + harga);
        }

        void hitungHargaTotal(int hrg, int trjl){
            hargaTotal = harga * trjl;
        }   

        void hitungDiskon(){
            if (hargaTotal > 150000) {
                System.out.println("Selamat anda mendapatkan diskon sebesar 12%");
                diskon = 0.12;
            } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
                System.out.println("Selamat anda mendapatkan diskon sebesar 5%");
                diskon = 0.5;
            } else{
                System.out.println("Anda tidak mendapatkan diskon.");
            }
        }

        void hitungHargaBayar(){
            totalDiskon = hargaTotal * diskon;
            System.out.println("Diskon yang didapat: " + totalDiskon);
            hargaTotal -= totalDiskon;
            System.out.println("Total Harga yang didapat: " + hargaTotal);
        }

        void terjual(int jml){
            if(stok > 0){
                stok -= jml;
            } else{
                System.out.println("Stock tidak tersedia.");
            }
        }

        void restock(int jml){
            stok += jml;
        }

        void gantiHarga(int hrg){
            harga = hrg;
        }
        
        public buku22(){

        }

        public buku22(String jud, String pg, int hal, int stok, int har){
            judul = jud;
            pengarang = pg;
            halaman = hal;
            this.stok = stok;
            harga = har;
        }
    
}
