package practice;
import java.util.Scanner;

public class Array {
    static void main(String[] args) {
      Scanner Sc= new Scanner (System.in);
      System.out.println ("enter the size of array  ");
      int size= Sc.nextInt();
    double[] Salaries = new double [size];
    for (int i=0; i<Salaries.length; i++)
    {
        System.out.println ("enter salary number " +(i+1) );
        Salaries [i]= Sc.nextDouble();

    }
   double sum=0;
    for (int i=0; i<Salaries.length; i++)
    {
        sum += Salaries [i];

    }
    System.out.println( "The sum of the salaries is " +sum);
    System.out.println ( "The average of the salaries is " +(sum/Salaries.length));


    }
}
