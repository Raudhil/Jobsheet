package Jobsheet_2;

import java.util.Scanner;

public class dragonMain {
    public static void main(String[] args) {
        
        String perintah = "";
        Scanner sc = new Scanner(System.in);

        dragon move = new dragon();

        move.x = 1;
        move.y = 1;

        System.out.println("Posisi x: " + move.x);
        System.out.println("Posisi y: " + move.y);

        
        while (!perintah.equalsIgnoreCase("atas") || !perintah.equalsIgnoreCase("bawah") || !perintah.equalsIgnoreCase("kanan") || !perintah.equalsIgnoreCase("kiri")) {
            
            System.out.print("Masukkan perintah(atas/bawah/kanan/kiri): ");
            perintah = sc.next();
    
            if (perintah.equalsIgnoreCase("atas")) {
                move.moveUp();
            } else if (perintah.equalsIgnoreCase("bawah")) {
                move.moveDown();
            } else if (perintah.equalsIgnoreCase("kanan")){
                move.moveRight();
            } else if (perintah.equalsIgnoreCase("kiri")){
                move.moveLeft();
            } else{
                System.out.println("Tolong Masukkan perintah yang tepat.");
            }

            

        }


    }
    
}
