package proprietes;

public class C1 {

    public int a = 1;
    public static int b = 1;
    public static final int C = 1;
    private int d = 1;

    void m1(int val) { this.a = val; }

    int m2() { return this.a; }

    void m3() {
        System.out.println("a = " + a);
    }

    int m4(int val) { return val+val; }

    int m5(int val) { return val + a; }

    int m6(int val) { return val + b; }

    int m7(int val) { return val + C; }

    int m8(int val) { return val + d; }

    int m9(int val) { return d/val; }

    int m10(int val) { return (int) (d/(float)val); }

    int m11(int val) { val++; return val; }

    public static void main(String[] args) {
        // System.out.println((new C1()).m9(0));
        System.out.println((new C1()).m10(0));
    }

}
