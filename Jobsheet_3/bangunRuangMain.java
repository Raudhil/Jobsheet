import java.util.Scanner;

public class bangunRuangMain {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        bangunRuang [] bangunan = new bangunRuang[3];

        String [] namaBangunan = {"Kerucut","Limas Segi Empat Sama Sisi","Bola"};


        for(int i = 0; i < 3; i++){
            
            if(i == 0){
                bangunan[i] = new bangunRuang();
                bangunan[i].jenisBangunRuang = i;
                System.out.println("Bangun Ruang " + namaBangunan[i]);
                System.out.println("");
                
                System.out.print("Masukkan Jari - jari: ");            
                bangunan[i].jariJari = sc.nextDouble();
                
                System.out.print("Masukkan Sisi Miring: ");            
                bangunan[i].sisiMiring = sc.nextDouble();

                bangunan[i].hitungLuasPermukaan();

                bangunan[i].hitungVolume();
                

            } else if (i == 1) {
                bangunan[i] = new bangunRuang();
                bangunan[i].jenisBangunRuang = i;
                System.out.println("\nBangun Ruang " + namaBangunan[i]);
                System.out.println("");
                
                System.out.print("Masukkan Panjang Sisi Alas: ");
                bangunan[i].sisi = sc.nextInt();
                
                System.out.print("Masukkan Tinggi Limas: ");
                bangunan[i].tinggi = sc.nextInt();

                bangunan[i].hitungLuasPermukaan();

                bangunan[i].hitungVolume();


            } else{
                bangunan[i] = new bangunRuang();
                bangunan[i].jenisBangunRuang = i;
                System.out.println("\nBangun Ruang " + namaBangunan[i]);
                System.out.println("");
                
                System.out.print("Masukkan Jari - jari: ");            
                bangunan[i].jariJari = sc.nextInt();

                bangunan[i].hitungLuasPermukaan();

                bangunan[i].hitungVolume();
            }
            

            
        }
        

        


    }
    
}
