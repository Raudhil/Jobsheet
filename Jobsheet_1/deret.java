package Jobsheet_1;

import java.util.Scanner;

public class deret {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = sc.next();

        int n = Integer.parseInt(nim.substring(8));

        for(int i = 1; i <= n; i++){
            if (i == 6 || i == 10) {
                continue;
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } 
            else{
                System.out.print("* ");
            }
        }
    }
}
