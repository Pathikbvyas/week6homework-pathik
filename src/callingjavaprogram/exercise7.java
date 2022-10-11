package callingjavaprogram;
/*7. Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).*/


import java.util.Scanner;

public class exercise7 {

    public static void main(String[] Strings) {

        Scanner abc = new Scanner(System.in);

        System.out.print(" temperature value in degree Fahrenheit : ");
        double fahrenheit = abc.nextDouble();

        double  celsius =(fahrenheit - 32)* (5/9);
        System.out.println(fahrenheit + " convert to degree Celsius " + celsius + " in Celsius");
    }

}
