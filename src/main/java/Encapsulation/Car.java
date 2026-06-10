package Encapsulation;

public class Car {
    //Attributes
  private int speed;
   private String color;
  private  String model;
   private  boolean isHatchBack;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isHatchBack() {
        return isHatchBack;
    }

    public void setHatchBack(boolean hatchBack) {
        isHatchBack = hatchBack;
    }

    public void SetSpeed (int speed)
  {
      this.speed=speed;
  }
  public int getSpeed (){
      return speed;
  }
//    String color;
//    String model;
//    boolean isHatchBack;
//
//
//    public Car(String model) {
//        this.model=model;
//
//    }
//   public Car (boolean isHatchBack,int speed)
//    {
//        this.isHatchBack=isHatchBack;
//        this.speed=speed;
//    }
//
//    //default constructor
//public Car (){
//   // System.out.println ("I'm using this constructor ");
//}
//
//    //Attributes
//
//
//
//    //Function  افعال
//    void turnone(){
//        System.out.println("the car is turned");
//    }
//    void trurnof(){
//
//        System.out.println("the car is turnof");
//
//    }
//    void breakcar(){
//
//        System.out.println ( "the car is break");
//    }
}


