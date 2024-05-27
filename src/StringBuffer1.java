import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public class StringBuffer1 {
    public static void main(String[] args) {
        String NIM = "", NamaP = "";
        BufferedReader objInput = new BufferedReader(new InputStreamReader(System.in));

        //Untuk nama yang saya gunakan sebagai contoh adalah "MUAMAR"

        try {
            System.out.println("==========================================");
            System.out.println("\t\t Input Data Mahasiswa       ");
            System.out.println("==========================================");
            System.out.println("NIM\t\t: ");
            NIM = objInput.readLine();
            System.out.println("Nama\t\t: ");
            NamaP = objInput.readLine();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        StringBuffer Nama = new StringBuffer(NamaP);

        System.out.println("==========================================");
        System.out.println("\t\t Cetak Data Mahasiswa       ");
        System.out.println("==========================================");
        System.out.println("NIM\t\t: " + NIM);
        System.out.println("Nama\t\t: " + Nama);

        System.out.println("Panjang Nama\t\t: " + Nama.length());
        System.out.println("Nama digabung dengan -bin Agus\t\t: " + Nama.append(" bin Agus"));
        System.out.println("Pembandingan dengan nama -Junaidi\t\t: " + Nama.equals("JUNAIDI"));
        System.out.println("Mengganti huruf pada indeks 2 hingga 4\t\t: " + Nama.replace(2, 4, "SIAPA AKU"));
        System.out.println("Mengambil tulisan dari 3 hingga akhir\t\t: " + Nama.substring(3));
        System.out.println("Mengambil tulisan dari 2 hingga 4\t\t: " + Nama.substring(2,4));
        System.out.println("Mengambil tulisan pada indeks 1\t\t: " + Nama.charAt(1));
        System.out.println("Menghapus tulisan pada indeks 1\t\t: " + Nama.deleteCharAt(1));
        System.out.println("Membalik tulisan dari akhir ke awal\t\t: " + Nama.reverse());
        System.out.println("==========================================");

    }
}
