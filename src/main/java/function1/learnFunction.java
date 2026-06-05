package function1;

public class learnFunction {
    static void main(String[] args) {
        drawline('*', 10);
        drawline('#',15);
        drawline('@',30);
        int x=20,y=50 ;
       System.out.println(sum (x,  y));
       int total = sum(x,y)*5/3;
       System.out.println(total);

    }

    public static void drawline(char ch, int length){

        int i;
        for(i=0;i<length;i++){
            System.out.print(ch);
        }
        System.out.println();
    }
    public static int sum (int i , int j ) {
        int result;
        result = i+j;
        return result;



    }
}
