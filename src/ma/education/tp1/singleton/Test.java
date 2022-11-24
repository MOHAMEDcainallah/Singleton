package ma.education.tp1.singleton;

public class Test {
    public static void main(String[] args) {
        Soleil s1 = Soleil.getInstance(1000.5);
        Soleil s2 = Soleil.getInstance(2000.5);
        System.out.println(s1.surface);
        System.out.println(s2.surface);
    }
}
