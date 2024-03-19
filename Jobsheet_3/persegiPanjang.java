import java.util.Scanner;

public class persegiPanjang {
    public int panjang;
        public int lebar;
        public static int persPanjang;

        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Masukkan jumlah Persegi Panjang: ");
            persPanjang = sc.nextInt();
            persegiPanjang [] ppArray = new persegiPanjang[persPanjang];
            

            for(int i = 0; i < persPanjang; i++){
                ppArray[i] = new persegiPanjang();
                System.out.println("Persegi panjang ke-" + i);
                System.out.print("Masukkan panjang: ");
                ppArray[i].panjang = sc.nextInt();
                System.out.print("Masukkan lebar: ");
                ppArray[i].lebar = sc.nextInt();
            }

            for(int i = 0; i < persPanjang; i++){
                System.out.println("Persegi Panjang ke-" + i);
                System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
            }

            
            
            
        }
}


