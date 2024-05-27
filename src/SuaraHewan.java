public class SuaraHewan {
    public static void main(String[] args) {
        Hewan HEWAN = new Hewan();
        Kucing KUCING = new Kucing();
        Kambing KAMBING = new Kambing();

        HEWAN.suara();

        HEWAN = KUCING;
        HEWAN.suara();

        HEWAN = KAMBING;
        HEWAN.suara();
    }
}
