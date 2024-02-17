import java.util.Scanner;

public class nilaiAkhir{
    public static void main(String[] args) {
        
        int nilai1,nilai2,nilai3,nilai4;
        double totalNilai = 10;
        String nilai;

        Scanner sc  = new Scanner(System.in);
        
        System.out.println("Program Menghitung Hasil Nilai Akhir");
        System.out.println("=====================================");
        System.out.print("Masukkan nilai Tugas: ");
        nilai1 = sc.nextInt();
        System.out.print("Masukkan nilai Kuis: ");
        nilai2 = sc.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        nilai3 = sc.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        nilai4 = sc.nextInt();

        totalNilai  = nilai1 * 0.2 + nilai2 * 0.2 + nilai3 * 0.3 + nilai4 * 0.3;

        if (totalNilai > 80 && totalNilai <= 100) {
            nilai = "A";
        } else if(totalNilai > 73 && totalNilai <= 80){
            nilai = "B";
        } else if(totalNilai > 65 && totalNilai <= 73){
            nilai =  "B+";
        } else if(totalNilai > 60 && totalNilai <= 65){
            nilai  = "C";
        } else if (totalNilai > 50 && totalNilai <= 60) {
            nilai =  "C+";
        } else if (totalNilai > 39 && totalNilai <= 50) {
            nilai = "D";
        } else{
            nilai = "E";
        }

        if (nilai1 > 100 || nilai2 > 100 || nilai3 > 100 || nilai4 > 100 || nilai1 < 0 || nilai2 < 0 || nilai3 < 0 || nilai4 < 0) {
            System.out.println("Nilai tidak valid");
            return;
        } else{
            System.out.println("Nilai akhir: " + totalNilai);
            System.out.println("Nilai huruf: " + nilai);
        }

        if (nilai.equals("D") || nilai.equals("E")) {
            System.out.println("Anda tidak lulus.");
        } else{
            System.out.println("Anda lulus.");
        }


    }
}