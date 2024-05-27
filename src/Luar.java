public class Luar {
    private int a;
    public void setA(int nilai) {
        a = nilai;
    }
    public int getA() {
        return a;
    }

//    class di dalam class
    public class Dalam {
        private int x = 100; // cuma bisa dibaca di kelas Dalam
        public void showData() {
            System.out.println("Nilai a dari kelas luar : " + a);
            System.out.println("Nilai x dari kelas dalam : " + x);
        }
    }
    public void showData() {
        Dalam object = new Dalam();
        object.showData();
    }
}
