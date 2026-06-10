package dayfive;

import Day4.BankAccount;

public class Main {
    static void main() {
        /*person person = new person();
        person person1 = new person("Mohammed  " , 26 , 'm');
        person1.printData();*/


        /*BankAccount bankAccount = new BankAccount(1000);
        bankAccount.getBalance();
        bankAccount.deposit(500);
        bankAccount.getBalance();*/


//        dog d  = new dog();
//        d.eat();
//        d.bark();
//        car car = new car();
//        car.start();
//        car.honk();`
//
//        Bike bike = new Bike();
//        bike.start();
//        bike.ringbill();
//        MathUtilities.add(10,20);
//        MathUtilities.add(2.5,10.5);
//        dog dog = new dog();
//        dog.sound();
        Shape [] shapes = {new Circle(), new Square(), new Triangle()};
        for ( Shape shape : shapes) {
            shape.draw();
        }



    }
}