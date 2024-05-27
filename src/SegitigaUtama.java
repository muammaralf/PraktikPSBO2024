public class SegitigaUtama {
    public static void main(String[] args) {
        InheritanceSegitiga segitiga = new InheritanceSegitiga();

        segitiga.setAlas(11);
        segitiga.setTinggi(9);
        System.out.println("========");
        System.out.println("Segitiga nih Bosssss");
        System.out.println("========");
        System.out.println("Alas : " + segitiga.getAlas());
        System.out.println("Tinggi : " + segitiga.getTinggi());
        System.out.println("Luas : " + segitiga.Luas());
    }

}
