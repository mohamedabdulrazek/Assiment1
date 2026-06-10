package dayfive;

public class Bike extends Vehicle{
    public Bike(){
        super("via", "2020" , "blue");
    }

    public void ringbill(){
        System.out.println("the bike ringbill Beep");
    }
    @Override
    public void start(){
        System.out.println("the bike start with kick.");
    }

}