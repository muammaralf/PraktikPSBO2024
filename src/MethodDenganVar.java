import java.util.Scanner;

public class MethodDenganVar {
    public static int nilai(int a) {
        return a;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Masukkan nilai : ");
        int x = inp.nextInt();

        System.out.println("=============");
        System.out.println(nilai(x));
    }
}
