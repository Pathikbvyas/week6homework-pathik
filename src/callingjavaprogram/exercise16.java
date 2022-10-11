package callingjavaprogram;
/*16.Write a Java program to add two binary numbers.
        Input Data:
        Input first binary number: 10
        Input second binary number: 11*/

import java.util.Scanner;

public class exercise16 {

    public static void main(String[] args)
    {
        Scanner test = new Scanner(System.in);
        {
            int a;
            int b;
            int x=0;
            int y=0;
            int[] abc = new int[10];

            System.out.print("Enter first binary number :- ");
            a = test.nextInt();
            System.out.print("Enter Second binary number :- ");
            b = test.nextInt();

            while(a!=0 || b!=0)
            {
                abc[x] = (int)((a%10 + b%10 + y)%2);
                x++;
                y = (int)((a%10 + b%10 + y)/2);
                a = a/10;
                b = b/10;
            }
            if(y!=0)
            {
                abc[x] = y;
                x++;
            }
            System.out.print("Sum of two binary numbers :- ");
            x--;
            while(x>=0)
            {
                System.out.print(abc[x]);
                x--;
            }
        }
    }
}
