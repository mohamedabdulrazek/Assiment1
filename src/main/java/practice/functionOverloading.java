package practice;

import java.util.Scanner;

public class functionOverloading {
    static void main(String[] args)
    {
        System.out.println("Enter the first number");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        System.out.println("Enter secound number");
        int number2 = sc.nextInt();
        System.out.println("Enter the 3th number");
        int number3 = sc.nextInt();
        System.out.println("the largre of the numbers is " +larger(number1,number2,number3));
    }
   public static int larger (int a, int b )
    {
        if (a>b)
        {
            return a;
        }
        else
            {
            return b;
            }
    }
    public static int larger (int a, int b ,int c)
    {
        if (a>b && a>c)
        {
            return a;
        }
        else if  (b>a && b>c)
        {
            return b;
        }
        else
        {
          return c;
        }
    }
}
