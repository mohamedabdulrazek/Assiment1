package Day4;

import java.awt.*;

public class main {

    void main(String[] args) {

//        Sum s = new Sum();
//        s.sum2Number(10, 20);
//
//        s.sum2Number(10, 40);
//
//        hamada();
//        total(10, 20);

        Redtangle rectangle = new Redtangle();
        double x = rectangle.calculateLength();
        System.out.println(x);

   }

    public static void hamada()
    {
        System.out.println("Hello, Hamada");
    }

    public static void total(int x, int y)
    {
        int sum = x + y;
        System.out.println("The total is: " + sum);
    }
}