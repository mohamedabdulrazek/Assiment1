package AssimentSession1;

public class Assiment {

        public static void main(String[] args) {
  String[] students = {"Mohamed", "Ahmed", "Atef", "Abdelrazek", "khaled"};

            for (int i = 0; i < students.length; i++) {
                System.out.println(students[i]);
            }
            students[2] = "Youssef";

            for (int i = 0; i < students.length; i++) {
                System.out.println(students[i]);
            }

            System.out.println(students[10]);
        }
    }


