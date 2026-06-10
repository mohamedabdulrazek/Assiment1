package inheritance;

public class Person {
   private int age;
    private String name;
    private String email;
    private String grade;
    private double heigh ;

    public Person(double heigh, String grade, String email, String name, int age) {
        this.heigh = heigh;
        this.grade = grade;
        this.email = email;
        this.name = name;
        this.age = age;
    }

    public Person ()
    {
        System.out.println("Person constructor");
    }

    public double getHeigh() {
        return heigh;
    }

    public void setHeigh(double heigh) {
        this.heigh = heigh;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void eat ()
    {
        System.out.print("i'm eating from person ");

    }
}
