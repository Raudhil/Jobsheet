package Jobsheet_6.P7;

public class pencarianBuku22 {
    buku22 listBk[] = new buku22[5];
    int idx;

    void tambah(buku22 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh.");
        }
    }

    void tampil() {
        for (buku22 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int findSeqSearch(int cari) {
        int posisi = 2;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku == cari) {
                posisi = i;
                break;
            } else {
                posisi = -1;
            }

        }
        return posisi;
    }

    public void tampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data: " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public void tampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku\t: " + x);
            System.out.println("Judul\t: " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t: " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t: " + listBk[pos].pengarang);
            System.out.println("Stock\t: " + listBk[pos].stock);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public buku22 findBuku(int x){
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku == x) {
                return listBk[i];
            }
        }
        return null;
    }

    public int findBinarySearch(int cari, int left, int right){
        int mid;
        if (right >= left) {
            mid = (right) / 2;
            if (cari == listBk[mid].kodeBuku) {
                return (mid);
            } else if (listBk[mid].kodeBuku > cari) {
                return findBinarySearch(cari, mid, right + 1);
            } else{
                return findBinarySearch(cari, left, mid);
            }
        }
        return -1;
    }
}
