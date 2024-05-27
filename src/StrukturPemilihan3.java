import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StrukturPemilihan3 {
    public static void main(String[] args) {
        String NIM = "", Nama = "";
        byte nilaiAbsen = 0, nilaiTugas = 0, nilaiUTS = 0, nilaiUAS = 0;
        BufferedReader objInput = new BufferedReader(new InputStreamReader(System.in));

        try {
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

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        System.out.println("==========================================");
        System.out.println("\t\t Cetak Data Mahasiswa       ");
        System.out.println("==========================================");
        System.out.println("NIM\t\t: " + NIM);
        System.out.println("Nama\t\t: " + Nama);
        System.out.println("Nilai Absen\t\t: " + nilaiAbsen);
        System.out.println("Nilai Tugas\t\t: " + nilaiTugas);
        System.out.println("Nilai UTS\t\t: " + nilaiUTS);
        System.out.println("Nilai UAS\t\t: " + nilaiUAS);
        System.out.println("==========================================");
        int total = ((nilaiAbsen*10/100) + (nilaiTugas*20/100) + (nilaiUTS*30/100) + (nilaiUAS*40/100));
        System.out.println("Nilai Total\t\t: " + total);

        char nilai;
        if (total >= 85 && total <= 100) {
            nilai = 'A';
        } else if (total >= 75 && total < 85) {
            nilai = 'B';
        } else if (total >= 65 && total < 75){
            nilai = 'C';
        } else if (total >= 55 && total < 65) {
            nilai = 'D';
        } else {
            nilai = 'E';
        }

        System.out.println("==========================================");
        System.out.println("Nilai\t\t: " + nilai);
        System.out.println("==========================================");
    }
}
