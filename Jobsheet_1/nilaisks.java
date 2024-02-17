package Jobsheet_1;

import java.util.Scanner;

public class nilaisks {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String [] matkul = {"Pancasila","Konsep Teknologi Informasi","Critical Thingking and Problem Solving","Matematika Dasar","Bahasa Inggris","Dasar Pemrograman","Praktikum Dasar Pemrograman","Keselamatan dan Kesehatan Kerja"};

        int [] nilMatkul = new int[8];
        String []nilai = new String[8];
        double []nilaiSetara = new double[8];
        int [] sks = {2,2,2,3,2,2,3,2};
        double ip = 0;

        for(int i = 0; i < 8; i++){
            System.out.print("Masukkan nilai " + matkul[i] + ": ");
            nilMatkul[i] = sc.nextInt();

            if (nilMatkul[i] > 80 && nilMatkul[i] <= 100) {
                nilai[i] = "A";
                nilaiSetara[i] = 4;
            } else if(nilMatkul[i] > 73 && nilMatkul[i] <= 80){
                nilai[i] = "B";
                nilaiSetara[i] = 3.5;
            } else if(nilMatkul[i] > 65 && nilMatkul[i] <= 73){
                nilai[i] =  "B+";
                nilaiSetara[i] = 3;
            } else if(nilMatkul[i] > 60 && nilMatkul[i] <= 65){
                nilai[i]  = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilMatkul[i] > 50 && nilMatkul[i] <= 60) {
                nilai[i] =  "C";
                nilaiSetara[i] = 2;
            } else if (nilMatkul[i] > 39 && nilMatkul[i] <= 50) {
                nilai[i] = "D";
                nilaiSetara[i] = 1;
            } else{
                nilai[i] = "E";
                nilaiSetara[i] = 0;
            }
        }

        
        System.out.println("==================================");
        System.out.println("Hasil Konversi Nilai.");
        System.out.println("==================================");

        System.out.println("MK\t\t\t\t\tNilai Angka\t\tNilai Huruf\t\tBobot Nilai");
        for(int j = 0 ; j < 8; j++){
            System.out.printf("%-44s%-25s%-23s%-10s\n", matkul[j],nilMatkul[j],nilai[j],nilaiSetara[j]);
        }

        for(int h = 0; h < 8; h++){
            ip += nilaiSetara[h] * sks[h];
        }

        ip /= 18;

        System.out.println("IP: " + ip);
        
    }
}
