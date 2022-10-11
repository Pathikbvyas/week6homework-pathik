package callingjavaprogram;



/*6. Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r).*/
import java.util.Scanner;

public class exercise6 {


    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);

        System.out.println("radius value of the circle: ");
        double radius = abc.nextDouble();
        System.out.println("Area is = " + (Math.PI * radius * radius));
    }
}




