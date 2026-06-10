package Encapsulation;

public class Main {
    static void main(String[] args) {
//        Car c1 = new Car();
//        c2.color = "red";
//        System.out.println(c2.color);

        //() construction
        // Car >>> class
        // c1 >>>> object




          //construction with model

//        Car c1 = new Car ("2025");
//
//
//        System.out.println( "the model is " +c1.model );

        // empty construction
//        Car c2 = new Car ();
//        c2.isHatchBack = true;


        //construction with speed and ishatchback

//       Car c3 = new Car (true, 202);









//        Car bmw = new Car ();
//
//
//        bmw.color  = "red";
//        bmw.speed = 220;
//        Car fiat = new Car ();
//        fiat.color= "blue";
//        System.out.println( "the color of the bmw is "+bmw.color);
//
//        System.out.println("the color of the fiat is "+fiat.color);



Car car1=new Car();
car1.SetSpeed(300);
        System.out.println(car1.getSpeed());

        car1.setColor("red");
        System.out.println(car1.getColor());


    }
}
