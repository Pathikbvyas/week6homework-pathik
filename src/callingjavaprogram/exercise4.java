package callingjavaprogram;

public class exercise4 {
    /* . Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme
*/
        //4.1
        int a = 25;
        int b = 35;
        static int x = 50;
        static int y = 60;

        //4.5 //4.6
        public static void main(String[] args) {
            exercise4 abc = new exercise4();
            abc.omg();
            omg1();

        }
        //4.2 //4.4
        public void omg() {
            System.out.println(a);
            System.out.println(b);
        }
        //4.2 //4.4
        public static void omg1() {
            System.out.println(x);
            System.out.println(y);
        }

}
