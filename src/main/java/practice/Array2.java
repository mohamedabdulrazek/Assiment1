package practice;
import java.util.Scanner;

public class Array2 {
    static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        System.out.println ("Enter the size of the array ");
        int size = Sc. nextInt();
        int []number = new int [size];
        for (int i=0; i<number.length ;i++) {

            System.out.println ("Enter the number "+(i+1));
            number[i] = Sc. nextInt();


        }
        int sum=0, count = 0;
        for (int i=0; i<number.length ;i++)
        {
            if(number[i]>0)
            {
                sum+=number[i];
                count++;
            }
            System.out.println ("The average is "+sum/count);
        }

    }
}
