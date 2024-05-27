import javax.swing.*;

public class EncapsulGajian {
    public static void main(String[] args) {
        GajianUhuy gajiPegawai = new GajianUhuy();
        double sg;
        String nilai;

        nilai = JOptionPane.showInputDialog("Masukkan Nominal Gaji");

        sg = Double.parseDouble(nilai);

        gajiPegawai.setGaji(sg);
        gajiPegawai.hitungGaji();
        System.out.println("Besaran Gaji Bersih : " + gajiPegawai.getGajiBersih());
    }
}
