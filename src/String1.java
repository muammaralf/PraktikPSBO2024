import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public class String1 {
    public static void main(String[] args) {
        String NIM = "", Nama = "";
        BufferedReader objInput = new BufferedReader(new InputStreamReader(System.in));

        //Untuk nama yang saya gunakan sebagai contoh adalah "MUAMAR"

        try {
            System.out.println("==========================================");
            System.out.println("\t\t Input Data Mahasiswa       ");
            System.out.println("==========================================");
            System.out.println("NIM\t\t: ");
            NIM = objInput.readLine();
            System.out.println("Nama\t\t: ");
            Nama = objInput.readLine();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        System.out.println("==========================================");
        System.out.println("\t\t Cetak Data Mahasiswa       ");
        System.out.println("==========================================");
        System.out.println("NIM\t\t: " + NIM);
        System.out.println("Nama\t\t: " + Nama);

        System.out.println("Panjang Nama\t\t: " + Nama.length());
        System.out.println("Nama digabung dengan -bin Agus\t\t: " + Nama.concat(" bin Agus"));
        System.out.println("Pembandingan dengan nama -Mukhroji\t\t: " + Nama.equals("Mukhroji"));
        System.out.println("Mengganti huruf M menjadi D\t\t: " + Nama.replace("M", "D"));
        System.out.println("Mengganti semua huruf A menjadi E\t\t: " + Nama.replaceAll("A", "E"));
        System.out.println("Mengganti huruf A pertama menjadi O\t\t: " + Nama.replaceFirst("A", "O"));
        System.out.println("Mengubah semua huruf menjadi kecil\t\t: " + Nama.toLowerCase(Locale.ROOT));
        System.out.println("Mengubah semua huruf menjadi besar\t\t: " + Nama.toUpperCase(Locale.ROOT));
        System.out.println("Mengambil tulisan dari 3 hingga akhir\t\t: " + Nama.substring(3));
        System.out.println("Mengambil tulisan dari 2 hingga 4\t\t: " + Nama.substring(2,4));
        System.out.println("Mengambil tulisan pada indeks 1\t\t: " + Nama.charAt(1));
        System.out.println("Mengambil indeks pada huruf U\t\t: " + Nama.indexOf("U"));
        System.out.println("==========================================");
    }
}
