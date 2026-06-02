package dayOne;

public class CastingInJava {
    static void main(String[] args) {
        int a = 15;
        double b = 15;

        System.out.println(a == b);


        int c = 15;
        System.out.println(Integer.toBinaryString(c));

        double d = 15.0;

        long bits = Double.doubleToRawLongBits(d);

        System.out.println(Long.toBinaryString(bits));

    }
}
