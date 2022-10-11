package callingjavaprogram;
/*14. Write a Java program to print the area and perimeter of a rectangle.
        Test Data:
        Width = 5.5 Height = 8.5
        Expected Output:
        Area is 5.6 * 8.5 = 47.60
        Perimeter is 2 * (5.6 + 8.5) = 28.20 */

public class exercise14 {

    public static void main(String[] args) {

        float Width =7.6f;
        float Height = 8.5f;

        float Area = (Width * Height);
        System.out.println("print the area     " + Area);
        float Perimeter =  2 * (Width + Height);
        System.out.println("perimeter of a rectangle:   "+ Perimeter );


    }
}

