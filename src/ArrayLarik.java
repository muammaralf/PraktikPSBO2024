import java.util.Scanner;

public class ArrayLarik {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        float arrayFloat[] = new float[5];

        System.out.println("Masukkan 5 nilai!");

        for (int i = 0; i < arrayFloat.length; i++) {
            System.out.print("Nilai ke " + (i+1) + " : ");
            arrayFloat[i] = inpt.nextFloat();
        }

        System.out.println("=========================");

        for (int i = 0; i < arrayFloat.length; i++)
            System.out.println("Nilai ke-" + (i+1) + " : " + arrayFloat[i]);
    }
}
