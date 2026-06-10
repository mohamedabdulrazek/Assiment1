package dayfive;

public class person {
    String name ;
    int age ;
    char  gender;


    //default constructor
    person()
    {
        System.out.println("def constructor");
    }
    //signature
    //setter
    person(String name,int age,char gender)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    //getter
    public void  printData()
    {
        System.out.println("name:"+name + "age:"+age +"    gender:"+gender );
    }
}