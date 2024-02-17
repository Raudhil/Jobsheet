package Jobsheet_1;

import java.util.Arrays;

public class fungsi {
    public static void main(String[] args) {
    

        int [][] royalGarden1 = {{10},{5},{15},{7}};
        int [][] royalGarden2 = {{6},{11},{9},{12}};
        int [][] royalGarden3 = {{2},{10},{10},{5}};
        int [][] royalGarden4 = {{5},{7},{12},{9}};

        

        String [] bunga =  {"Aglonema","Keladi","Alosia","Mawar"};

        System.out.println("Stock Royal Garden 1");
        stock(royalGarden1,bunga);
        System.out.println("\nStock Royal Garden 2");
        stock(royalGarden2,bunga);
        System.out.println("\nStock Royal Garden 3");
        stock(royalGarden3,bunga);
        System.out.println("\nStock Royal Garden 4");
        stock2(royalGarden4,bunga);
    
        System.out.println("");

        System.out.println("Pendapatan Royal Garden 1");
        pendapatan(royalGarden1,bunga);
        System.out.println("\nPendapatan Royal Garden 2");
        pendapatan(royalGarden2,bunga);
        System.out.println("\nPendapatan Royal Garden 3");
        pendapatan(royalGarden3,bunga);
        System.out.println("\nPendapatan Royal Garden 4");
        pendapatan(royalGarden4,bunga);

        
    }

    static void pendapatan(int [][] total, String [] bunga){
        
            total[0][0] *= 75000; 
            total[1][0] *= 50000;
            total[2][0] *= 60000; 
            total[3][0] *= 15000;

            for(int i = 0 ; i < 4; i++){
                System.out.println(bunga[i] + ": " + total[i][0]);
            }
        

    }

    static void stock(int [][] total,String [] bunga){
        
        for(int i = 0 ; i < total.length; i++){
            System.out.println(bunga[i] + ": " + total[i][0]);
        }

    }

    static void stock2(int [][] total,String [] bunga){
        
        total[0][0] -= 1;
        total[1][0] -= 2;
        total[3][0] -= 5;

        for(int i = 0 ; i < total.length; i++){
            System.out.println(bunga[i] + ": " + total[i][0]);
        }
    }
}
