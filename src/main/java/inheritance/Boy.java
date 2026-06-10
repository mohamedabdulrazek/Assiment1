package inheritance;


public class Boy extends Person{
    private boolean hadMilitaryServes;



    public Boy (){
        System.out.println("Boy constructor");
    }

    public boolean isHadMilitaryServes() {
        return hadMilitaryServes;
    }

    public void setHadMilitaryServes(boolean hadMilitaryServes) {
        this.hadMilitaryServes = hadMilitaryServes;
    }

    @Override
    public void eat() {
        super.eat();

        System.out.println(" and boy ");
    }
}
