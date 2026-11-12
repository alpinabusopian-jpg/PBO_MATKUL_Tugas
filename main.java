package Tugas_p8_matkul;


public class main {

    public static void main(String[] args) {

        Persegi persegi = new Persegi();
        persegi.setSisi(5);
        System.out.println("=== Persegi ===");
        System.out.println("Sisi     : " + persegi.getSisi());
        System.out.println("Luas     : " + persegi.getLuas());
        System.out.println("Keliling : " + persegi.getKeliling());
        System.out.println();

        
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setJari(7);
        System.out.println("=== Lingkaran ===");
        System.out.println("Jari-jari: " + lingkaran.getJari());
        System.out.println("Luas     : " + lingkaran.getLuas());
        System.out.println("Keliling : " + lingkaran.getKeliling());
        System.out.println();

        
        PersegiPanjang pp = new PersegiPanjang();
        pp.setPanjang(8);
        pp.setLebar(4);
        System.out.println("=== Persegi Panjang ===");
        System.out.println("Panjang  : " + pp.getPanjang());
        System.out.println("Lebar    : " + pp.getLebar());
        System.out.println("Luas     : " + pp.getLuas());
        System.out.println("Keliling : " + pp.getKeliling());
        System.out.println();

     
        Segitiga segitiga = new Segitiga();
        segitiga.setAlas(6);
        segitiga.setTinggi(4);
        segitiga.setSisiMiring1(5);
        segitiga.setSisiMiring2(5);
        System.out.println("=== Segitiga ===");
        System.out.println("Alas     : " + segitiga.getAlas());
        System.out.println("Tinggi   : " + segitiga.getTinggi());
        System.out.println("Luas     : " + segitiga.getLuas());
        System.out.println("Keliling : " + segitiga.getKeliling());
    }
}
