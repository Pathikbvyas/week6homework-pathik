package callingjavaprogram;


/*5. Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.
*/

import java.util.Scanner;

public class exercise5revised {

    public static void main(String[] args) {
        exercise5revised abc = new exercise5revised();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first number:  ");
        int x = scanner.nextInt();
        System.out.println("Please enter your secound number:  ");
        int y = scanner.nextInt();
        abc.addition(x, y);
        abc.subtraction(x, y);
        abc.multiplication(x, y);
        abc.division(x, y);
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

}


