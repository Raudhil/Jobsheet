public class segitiga {
    
    public int alas;
    public int tinggi;
    public double luas;
    public double keliling;
    public double sisiMiring;

    public segitiga(int a,int t){
        this.alas = a;
        this.tinggi = t;

        System.out.println(a);
        System.out.println(t);
    }

    void hitungLuas(){
        luas = alas * tinggi / 2;
        System.out.println("Luasnya adalah: " + luas);
    }

    void hitungKeliling(){
        sisiMiring = Math.pow((1/2 * alas),2) + Math.pow(tinggi, 2);
        keliling = sisiMiring * 2 + alas;
        System.out.println("Kelilingnya adalah: " + keliling);
    }

    public static void main(String[] args) {
        segitiga [] sgArray = new segitiga[4];

        sgArray[0] = new segitiga(10, 4);
        sgArray[1] = new segitiga(20, 10);
        sgArray[2] = new segitiga(15, 6);
        sgArray[3] = new segitiga(25, 10);

        for(int i = 0; i < 3; i++){
            sgArray[i].hitungLuas();
            sgArray[i].hitungKeliling();
        }
    }
}


