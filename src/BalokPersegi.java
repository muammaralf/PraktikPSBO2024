public class BalokPersegi {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        persegi.setPanjang(4);
        persegi.setLebar(7);
        System.out.println("=========");
        System.out.println("Contoh Inheritance");
        System.out.println("=========");
        System.out.println("Persegi Panjang");
        System.out.println("Panjang : " + persegi.getPanjang());
        System.out.println("lebar : " + persegi.getLebar());
        System.out.println("Luar : " + persegi.Luas() + " persegi");
        System.out.println("=========");

        Balok balok = new Balok();
        balok.setPanjang(5);
        balok.setLebar(3);
        balok.setTinggi(1);
        System.out.println("\n=========");
        System.out.println("Balok");
        System.out.println("=========");
        System.out.println("Panjang : " + balok.getPanjang());
        System.out.println("Lebar : " + balok.getLebar());
        System.out.println("Tinggi : " + balok.getTinggi());
        System.out.println("Volume : " + balok.Volume() + " kubik");
        System.out.println("=========");
    }
}
