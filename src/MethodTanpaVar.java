public class MethodTanpaVar {
    public static void printKalimat() {
        System.out.println("Ini di dalam method printKalimat.");
    }

    public static void main(String[] args) {
        printKalimat();
        System.out.println("Ini di dalam main.");
        printKalimat();
    }
}
