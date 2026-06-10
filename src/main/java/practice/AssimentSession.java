package practice;

import java.util.Scanner;
public class AssimentSession {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperature,average, sum=0;
        int hours=0;
        boolean heating= false ;
        for (int i =1; i<8; i ++)
        {
            System.out.println("Enter temperature"+i);
            temperature = sc.nextDouble();
            sum += temperature;
            if (temperature<26)
            {
                System.out.println("the ac is on ");
                hours ++;
            }
            else {
                System.out.println("the ac is off ");
            }
            if  (temperature>30)
            heating = true;
            {
                System.out.println();
            }
            average = sum/hours;
            System.out.println("The average temperature is"+average);
            System.out.println("the hours is "+hours);


        }

    }
}
