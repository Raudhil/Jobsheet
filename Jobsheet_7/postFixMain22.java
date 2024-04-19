package Jobsheet_7;

import java.util.Scanner;

public class postFixMain22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p,q;
        System.out.print("Masukkan ekspresi matematika (infix): ");
        q = sc.nextLine();
        q = q.trim();
        q = q + ")";

        int total =  q.length();
        postFix22 post = new postFix22(total);
        p = post.konversi(q);
        System.out.println("Postfix: " + p);
    }
}
