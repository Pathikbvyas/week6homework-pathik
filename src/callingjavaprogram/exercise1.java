package callingjavaprogram;
/* Write a java program using following steps
    1.1 Declare two instance variables.
    1.2 Declare one instance method.
    1.3 Call both instance variables into the instance method inside the print statement.
    1.4 Declare the Main method.
    1.5 Call the above instance method into the Main method and Run the programme.
 */

public class exercise1 {
    int a = 10; //Instance variable
    int b = 20; //instance variable

    public static void main(String[] args) {
    exercise1 obj = new exercise1();
    obj.myMethod();

    }
    // declared one instance method
    public void myMethod(){

        System.out.println(a);
        System.out.println(b);
    }

}
