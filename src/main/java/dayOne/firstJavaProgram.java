package dayOne;

import java.time.LocalDate;

public class firstJavaProgram {public static void main(String[] args) {

//    System.out.println("Hello Big boy ");
    //comment line

    /*
     another way to comment*/

//    String firstname = "mohamed";
//    String x = "2+2";
//    System.out.println(x);
//    String X = "10";
//    String y = "5";
//    System.out.println(X+y); //concatenation
//int x=1000;
//int y=2000;
//int sum=x+y;
//System.out.println(x+y);
//System.out.println("the sum is " x+y); the wrong way to add string with the int
//System.out.println("the sum of the number is " +sum); //correct ot add string and the another data type
//    System.out .println("the sum of the number is "+(x+y));// the another way to writhe string with another data type
//
//    //2- float
//    float f=12.09f;
//    System.out.println(f);
//    //3- double
//    double d=500; //500.0
//    double l=55.33;
//    System.out.println(d);
//    System.out.println(l);
//
    String firstName = "mohamed";
    String lastName = "abdelrazek";
    String fullName = firstName + " " + lastName;
    int age = 21;
    String dateOfBirth = "24/08/2004";
    String jobTitle = "Software Testing";
    double income = 10.5;
    double tax = income * 0.15;
    double netSalary = income - tax;
 System.out.println("*********************************");

 System.out.println("hello my name is " +firstName+
 "\n my age is "+age+
         "\n my jog is"+jobTitle+
         "\n my income is "+netSalary);

System.out.println("*********************************");

    System.out.printf("my full name is %s%n" +
                    "my age is %d%n" +
                    "my job is %s%n" +
                    "my income is %f%n",
            firstName, age, income, netSalary);

}
}
