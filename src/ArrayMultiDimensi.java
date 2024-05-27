import java.util.Scanner;

public class ArrayMultiDimensi {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        int[][] array2d = new int[3][4];
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.print("Masukkan nilai [" + i + "] [" + j + "] : ");
                array2d[i][j] = inpt.nextInt();
            }
        }
        System.out.println("==================");

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.print(array2d[i][j] + "\t");
            }
            System.out.println("");
            }
    }
}
