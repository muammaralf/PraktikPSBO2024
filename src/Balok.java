public class Balok extends Persegi {
    public int tinggi;

    public void setTinggi(int t) {
        tinggi = t;
    }

    public int getTinggi() {
        return tinggi;
    }

    public int Volume() {
        int volume = getPanjang()*getLebar()*tinggi;
        return volume;
    }
}
