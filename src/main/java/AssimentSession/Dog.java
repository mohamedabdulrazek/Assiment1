package AssimentSession;

public class Dog extends Animal {

    // لازم تعمل override للـ abstract method
    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof");
    }

}