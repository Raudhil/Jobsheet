public class bangunRuang {

    public double jariJari;
    public double sisiMiring;
    public int tinggi;
    public int sisi;
    public double luasPermukaan;
    public double volume;
    public int jenisBangunRuang;


    void hitungLuasPermukaan() {
        if (jenisBangunRuang == 0) {
            luasPermukaan = 3.14 * jariJari * (jariJari + sisiMiring);

            System.out.println("Luas Permukaannya adalah: " + luasPermukaan);
        } else if(jenisBangunRuang == 1){
            luasPermukaan = sisi * sisi + 4 * (0.5 * sisi * tinggi);

            System.out.println("Luas Permukaannya adalah: " + luasPermukaan);
        } else{
            luasPermukaan = 4 * Math.PI * jariJari * jariJari;
            
            System.out.println("Luas Permukaannya adalah: " + luasPermukaan);
        }
        
    }

    void hitungVolume() {
        if (jenisBangunRuang == 0) {
            volume = (1.0 / 3.0) * Math.PI * jariJari * jariJari * sisiMiring;

            System.out.println("Volumenya adalah: " + volume);
        } else if(jenisBangunRuang == 1){
            volume = (1.0/3.0) * sisi * sisi * tinggi;

            System.out.println("Volumenya adalah: " + volume);
        } else{
            volume = (4.0/3.0) * Math.PI * jariJari * jariJari * jariJari;

            System.out.println("Volumenya adalah: " + volume);
        }
        
    }

}
