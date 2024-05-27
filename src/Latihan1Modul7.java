public class Latihan1Modul7 {
    public static void printPON() {
        String provinsi[] = {"DKI Jakarta", "Jawa Barat", "Jawa Tengah"};
        int[][] medali = {
                {15, 17, 13},
                {13, 15, 15},
                {10, 9, 12}
            };

        System.out.println("|\tAsal Provinsi\t|\t2015\t|\t2016\t|\t2017\t|");
        System.out.println("");

        for (int i = 0; i < provinsi.length; i++) {
            System.out.print("|\t" + provinsi[i] + "\t\t|");
            for (int j = 0; j < medali[i].length; j++) {
                System.out.print("\t" + medali[i][j] + "\t\t|");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printPON();
    }
}
