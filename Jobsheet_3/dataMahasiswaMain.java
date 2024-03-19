import java.util.Scanner;

public class dataMahasiswaMain {
    public static void main(String[] args) {
        dataMahasiswa [] mahasiswa = new dataMahasiswa[3];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            mahasiswa[i] = new dataMahasiswa();
            System.out.print("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("\nMasukkan nama: ");
            mahasiswa[i].nama = sc.next();
            System.out.print("Masukkan NIM: ");
            mahasiswa[i].nim = sc.next();
            System.out.print("Masukkan Jenis Kelamin: ");
            mahasiswa[i].kelamin = sc.next();
            System.out.print("Masukkan IPK: ");
            mahasiswa[i].ipk = sc.nextDouble();
            
        }

        for(int i = 0; i < 3; i++){
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("Nama: " + mahasiswa[i].nama);
            System.out.println("NIM: " + mahasiswa[i].nim);
            System.out.println("Jenis Kelamin: " + mahasiswa[i].kelamin);
            System.out.println("Nilai IPK: " + mahasiswa[i].ipk);
        }

        System.out.println("Rata-rata IPK adalah: " + hitungRataRataIPK(mahasiswa[0].ipk, mahasiswa[1].ipk, mahasiswa[2].ipk));
        ipkTerbesar(mahasiswa[0].ipk, mahasiswa[1].ipk, mahasiswa[2].ipk);

    }

    public static double hitungRataRataIPK(double ipk1,double ipk2,double ipk3){
        dataMahasiswa mahasiswa = new dataMahasiswa();

        return mahasiswa.rataRataIpk = (ipk1 + ipk2 + ipk3) / 3;
    }
    public static void ipkTerbesar(double ipk1,double ipk2,double ipk3){
        
        double [] nilaiIpk = new double[3];
        nilaiIpk[0] = ipk1;
        nilaiIpk[1] = ipk2;
        nilaiIpk[2] = ipk3;
        
        double maxNum = nilaiIpk[0];

        for (int i = 0; i < nilaiIpk.length; i++) {
            if (nilaiIpk[i] > maxNum) {
                maxNum = nilaiIpk[i];
            }
        }

        System.out.println("IPK terbesar adalah: " + maxNum);
    }
    
}
