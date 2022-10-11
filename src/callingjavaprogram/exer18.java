package callingjavaprogram;

/*18. Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5*/
import java.util.Scanner;
public class exer18 {

    public static void main(String[] args) {
        exer18 abc = new exer18();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first number:  ");
        int x = scanner.nextInt();
        System.out.println("Please enter your secound number:  ");
        int y = scanner.nextInt();
        abc.addition(x, y);
        abc.subtraction(x, y);
        abc.multiplication(x, y);
        abc.division(x, y);
        abc.mod(x,y);

    }

    public void addition(int x, int y) {
        System.out.println("Addition:- " + (x + y));

    }

    public void subtraction(int x, int y) {
        int a = x - y;
        System.out.println("subtraction:- " + a);

    }

    public static void multiplication(int x, int y) {
        int b = x * y;
        System.out.println("multiplication:- " + b);

    }

    public static void division(int x, int y) {
        int c = x / y;
        System.out.println("division:- " + c);

    }
    public static void mod(int x, int y) {
        int d= x % y;
        System.out.println("mod:- "+ d);

    }
}
