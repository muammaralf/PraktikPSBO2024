public class Oprt1 {
    public static void main(String[] args) {

        String Nama = "Muamar Ali Fahmi", NIM = "21520241006";
        String matKul = "Pemrograman Berorientasi Obyek 1";
        byte nilaiAbsen = 100, nilaiTugas = 94, nilaiUTS = 87, nilaiUAS = 95;
        byte jmlhSKS = 8;
        int biayaPerSKS = 90000;

        System.out.println("==========================================");
        System.out.println("\t\t Input Data Mahasiswa       ");
        System.out.println("==========================================");
        System.out.println("NIM\t\t\t\t: " + NIM);
        System.out.println("Nama\t\t\t: " + Nama);
        System.out.println("Nilai Absen\t\t: " + nilaiAbsen);
        System.out.println("Nilai Tugas\t\t: " + nilaiTugas);
        System.out.println("Nilai UTS\t\t: " + nilaiUTS);
        System.out.println("Nilai UAS\t\t: " + nilaiUAS);
        System.out.println("==========================================");
        int total = ((nilaiAbsen*10/100) + (nilaiTugas*20/100) + (nilaiUTS*30/100) + (nilaiUAS*40/100));
        System.out.println("Nilai Total\t\t: " + total);
        System.out.println("==========================================");
    }
}
