import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Char1 {
    public static void main(String[] args) {
        String P = "";
        BufferedReader objInput = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("==========================================");
            System.out.println("Isi dengan satu karakter\t: ");
            P = objInput.readLine();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        Character X = new Character(P.charAt(0));

        System.out.println("==========================================");
        System.out.println("Cetak karakter");
        System.out.println("==========================================");
        System.out.println("Apakah merupakan bilangan? " + Character.isDigit(X));
        System.out.println("Apakah merupakan huruf? " + Character.isLetter(X)) ;
        System.out.println("Apakah merupakan bilangan atau huruf? " + Character.isLetterOrDigit(X));
        System.out.println("Apakah merupakan spasi? " + Character.isWhitespace(X));
        System.out.println("Apakah huruf kecil? " + Character.isLowerCase(X));
        System.out.println("Apakah huruf besar? " + Character.isUpperCase(X));
        System.out.println("Mengubah ke huruf kecil : " + Character.toLowerCase(X));
        System.out.println("Mengubah ke huruf besar : " + Character.toUpperCase(X));
        System.out.println("Mengkonversi ke string : " + Character.toString(X));
        System.out.println("Cara kedua mengkonversi ke string : " + X.toString());
    }
}
