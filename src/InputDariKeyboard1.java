import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputDariKeyboard1 {
    public static void main(String[] args) {
        String NIM = "", Nama = "";
        byte nilaiAbsen = 0, nilaiTugas = 0, nilaiUTS = 0, nilaiUAS = 0;
        BufferedReader objInput = new BufferedReader(new InputStreamReader(System.in));

        try {
//            Console
            System.out.println("==========================================");
            System.out.println("\t\t Input Data Mahasiswa       ");
            System.out.println("==========================================");
            System.out.println("NIM\t\t: ");
            NIM = objInput.readLine();
            System.out.println("Nama\t\t: ");
            Nama = objInput.readLine();
            System.out.println("Nilai Absen\t\t: ");
            nilaiAbsen = Byte.parseByte(objInput.readLine());
            System.out.println("Nilai Tugas\t\t: ");
            nilaiTugas = Byte.parseByte(objInput.readLine());
            System.out.println("Nilai UTS\t\t: ");
            nilaiUTS = Byte.parseByte(objInput.readLine());
            System.out.println("Nilai UAS\t\t: ");
            nilaiUAS = Byte.parseByte(objInput.readLine());

//            GUI
//            NIM = JOptionPane.showInputDialog("NIM:");
//            Nama = JOptionPane.showInputDialog("Nama:");
//            nilaiAbsen = Byte.parseByte(JOptionPane.showInputDialog("Nilai Absen:"));
//            nilaiTugas = Byte.parseByte(JOptionPane.showInputDialog("Nilai Tugas:"));
//            nilaiUTS = Byte.parseByte(JOptionPane.showInputDialog("Nilai UTS:"));
//            nilaiUAS = Byte.parseByte((JOptionPane.showInputDialog("Nilai UAS:")));
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        System.out.println("==========================================");
        System.out.println("\t\t Input Data Mahasiswa       ");
        System.out.println("==========================================");
        System.out.println("NIM\t\t: " + NIM);
        System.out.println("Nama\t\t: " + Nama);
        System.out.println("Nilai Absen\t\t: " + nilaiAbsen);
        System.out.println("Nilai Tugas\t\t: " + nilaiTugas);
        System.out.println("Nilai UTS\t\t: " + nilaiUTS);
        System.out.println("Nilai UAS\t\t: " + nilaiUAS);
    }
}
