package callingjavaprogram;
/*10.Write a Java program that takes a number as input and prints its
multiplication table up to 10.
Test Data: Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
*/
public class exercise10 {

    public static void main(String[] args) {
        int a = 8;
        for (int b = 1;  b <= 10; b++) {
            System.out.println(a + " * " + b + " = " + a * b);
        }
    }
}
