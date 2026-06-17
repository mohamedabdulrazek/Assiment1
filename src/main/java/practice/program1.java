package practice;
import java.util.Scanner;

public class program1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double extraweight = 0, fee = 0;
        System.out.println("how must the passenger  ");
        int passenger = sc.nextInt();
        for (int i = 1; i < passenger ;i++ ){
        System.out.println(" please enter your bag class number "+ i);
        char bagclass = sc.next().charAt(0);
        System.out.println("please enter your weight");
        double bagweight = sc.nextDouble();

            switch (bagclass) {
                case 'A':
                case 'a':
                    if (bagweight > 30) {
                        extraweight = bagweight - 30;
                        fee = extraweight * 10;
                    }
                    break;
                case 'B':
                case 'b':
                    if (bagweight > 25) {
                        extraweight = bagweight - 25;
                        fee = extraweight * 10;
                    }
                    break;
                case 'C':
                case 'c':
                    if (bagweight > 15) {
                        extraweight = bagweight - 15;
                        fee = extraweight * 10;
                    }
                    break;
                default:
                    System.out.println("please enter a valid class");


            }
            System.out.println("your fee is " + fee);


        }
    }
}
