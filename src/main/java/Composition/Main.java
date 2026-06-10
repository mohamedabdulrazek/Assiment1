package Composition;

import org.w3c.dom.ls.LSOutput;

public class Main {
    static void main(String[] args) {
        Car c1 = new Car();

        c1.setColor("blue");
        System.out.println(c1.getColor());

        Engine e1 = new Engine("202","bmw");
        c1.setEngine(e1);
        System.out.println(c1.getEngine().getType());


    }



}
