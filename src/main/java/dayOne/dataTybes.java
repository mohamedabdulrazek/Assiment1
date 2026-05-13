package dayOne;

public class dataTybes {
    public static void main(String[] args) {

        //primitive data tybes
        int myInt = 100; // Size 4 bytes
        byte myByte = 10; // Size 1 byte
        short myShort = 30000; // Size 2 bytes
        long myLong = 100000L; // Size 8 bytes
        float myFloat = 10000.0F; // size 4 bytes
        double myDouble = 10000.0; // size 8 bytes

        System.out.println("Integer: " + myInt);
        System.out.println("Byte: " + myByte);
        System.out.println("Short: " + myShort);
        System.out.println("Long: " + myLong);
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);

        //char
        char myChar = 'A'; // size 2 bytes
        System.out.println("Char: " + myChar);

        // boolean -> true , false

        boolean myBool = true; // Size 1 byte, default false
        /*
        false = 0
        true = 1
        */
        System.out.println("Bool: " + hamada);

    }
    static boolean hamada; //default false
}
