package dayfive;

public class dog extends Animal {
    @Override
    public void eat(){
        System.out.println("this Dog eats Bone");
    }
    public void bark(){
        System.out.println("this animal barks");
    }
    @Override
    public void sound(){
        System.out.println("the dog barks");
    }
}