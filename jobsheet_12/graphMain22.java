package jobsheet_12;

import java.util.Scanner;

public class graphMain22 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        graph22 gedung = new graph22(6);

        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();
        gedung.removeEdge(1, 3);
        gedung.printGraph();

        System.out.print("Masukkan node asal: ");
        int asal = sc.nextInt();
        System.out.print("Masukkan node tujuan: ");
        int tujuan = sc.nextInt();

        if (gedung.adjacency(asal, tujuan)) {
            System.out.println("Ada jalan dari " + (char) ('A' + asal) + " ke " + (char) ('A' + tujuan));
        } else {
            System.out.println("Tidak ada jalan dari " + (char) ('A' + asal) + " ke " + (char) ('A' + tujuan));
        }

        System.out.println();

        graphMatriks22 gdg = new graphMatriks22(4);
        gdg.degree(0);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        System.out.println("Hasil setelah penghapusan edge");
        gdg.removeEdge(2, 1);
        gdg.printGraph();
    }
}
