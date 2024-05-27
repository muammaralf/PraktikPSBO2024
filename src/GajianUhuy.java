public class GajianUhuy {
    private double gajiPokok, gajiStlhPajak, pajakGaji;
    private double potongan = 100000;
    public double gajiBersih;

    public void setGaji(double gaji) {
        gajiPokok = gaji;
    }

    public void hitungGaji(){
        gajiStlhPajak = gajiPokok - (0.1 * gajiPokok);
        pajakGaji = (gajiPokok*0.1);
        gajiBersih = gajiStlhPajak - potongan;

        System.out.println("Besar Pajak Gaji : " + pajakGaji);
        System.out.println("Besar Potongan Gaji : " + potongan);
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public double getGajiBersih() {
        return gajiBersih;
    }

}
