package Day4;
import java.util.Scanner;
public class Redtangle {
    Scanner sc = new Scanner(System.in);
    public  double length ;
    public  double width ;
    public double calculateLength(){
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter width: ");
        width = sc.nextDouble();
        double area = length*width;
        return area;

    }

}
