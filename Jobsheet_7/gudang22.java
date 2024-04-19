package Jobsheet_7;

public class gudang22 {
    barang22[] tumpukan;
    int size;
    int top;

    public gudang22(int kapasitas) {
        size = kapasitas;
        tumpukan = new barang22[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(barang22 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di gudang sudah penuh");
        }
    }

    public barang22 ambilBarang() {
        if (!cekKosong()) {
            barang22 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang");
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong!");
            return null;
        }
    }

    public barang22 lihatBarangTeratas() {
        if (!cekKosong()) {
            barang22 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public barang22 lihatBarangTerbawah() {
        if (!cekKosong()) {
            barang22 barangTerbawah = tumpukan[0];
            System.out.println("Barang terbawah: " + barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public String cariNamaBarang(String brg) {
        if (!cekKosong()) {
            for (int i = 0; i < tumpukan.length; i++) {
                if (tumpukan[i].nama.equalsIgnoreCase(brg)) {
                    return brg;
                }
            }
        }
        return null;
    }

    public int cariKodeBarang(int kode) {
        if (!cekKosong()) {
            for (int i = 0; i < tumpukan.length; i++) {
                if (tumpukan[i].kode == kode){
                    return kode;
                }
            }
        }
        return 0;
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang");
            for (int i = 0; i <= top; i++) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong.");
        }
    }

    public String konversiDesimalKeBiner(int kode) {
        stackKonversi22 stack = new stackKonversi22();
        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }

        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
