package Tugas_p8_matkul;


public class Segitiga extends BangunDatar {

    private float alas;
    private float tinggi;

    // Atribut tambahan untuk menghitung keliling segitiga
    private float sisiMiring1;
    private float sisiMiring2;

    public void setAlas(float alas) {
        this.alas = alas;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public void setSisiMiring1(float sisiMiring1) {
        this.sisiMiring1 = sisiMiring1;
    }

    public void setSisiMiring2(float sisiMiring2) {
        this.sisiMiring2 = sisiMiring2;
    }

    public float getAlas() {
        return alas;
    }

    public float getTinggi() {
        return tinggi;
    }

    public float getSisiMiring1() {
        return sisiMiring1;
    }

    public float getSisiMiring2() {
        return sisiMiring2;
    }

    @Override
    protected float luas() {
        return 0.5f * alas * tinggi;
    }

    @Override
    protected float keliling() {
        return alas + sisiMiring1 + sisiMiring2;
    }

    @Override
    public float getLuas() {
        return luas();
    }

    @Override
    public float getKeliling() {
        return keliling();
    }
}
