package practice;
import java.util.Scanner;

public class practice {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter3 number");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        int total = sum (number1,number2,number3);
        double avg = sum (number1,number2,number3)/3;
        desplay(total,avg);



    }
    public static int sum(int n1, int n2, int n3)
    {
        int result = n1+n2+n3;
        return result;
    }
    public static double average (int n1, int n2, int n3)
    {
        return (sum(n1,n2,n3)/3);
    }
   public static void  desplay(int s, double a)
    {
        System.out.println("the sum of the 3 number is " +s);
        System.out.println("the avg of the 3 number is " +a);
    }
}
