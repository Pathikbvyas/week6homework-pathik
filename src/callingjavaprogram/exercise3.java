package callingjavaprogram;
/*3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.

 */
public class exercise3 {
    int a = 11;
    static int b = 12;

    public static void main(String[] args) {


        System.out.println(b);
    }
    public void ins(){
        System.out.println(a);
      //  System.out.println(exercise3.b);
    }

}
