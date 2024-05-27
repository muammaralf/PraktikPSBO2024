public class InheritanceSegitiga extends Segitiga{
    public float Luas() {
        float luas = (float) (0.5 * getAlas() * getTinggi());
        return luas;
    }
}
