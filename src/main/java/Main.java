import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner option = new Scanner(System.in);
        Scanner number = new Scanner(System.in);

        //variables
        int choice = 0;
        double area;

        while (choice != 8){

            //menuOptions
            System.out.println("Enter number associated with shape you want to calculate area for: \n" +
                    "1. Square \n" +
                    "2. Trapezoid \n" +
                    "3. Ellipse \n" +
                    "4. Rectangle \n" +
                    "5. Parallelogram \n" +
                    "6. Triangle \n" +
                    "7. Circle \n" +
                    "8. Quit");
            choice = option.nextInt();

            switch (choice) {

                //square
                case 1:
                    //user input
                    System.out.println("Enter side length for square: ");
                    double s = number.nextDouble();

                    //calculation called in result
                    area = Math.pow(s, 2);

                    //result of calculation
                    System.out.println("Area of square = " + area);
                    break;

                //Trapezoid
                case 2:
                    //user input
                    System.out.println("Enter value for base a: ");
                    double a = number.nextDouble();
                    System.out.println("Enter value for base b: ");
                    double b = number.nextDouble();
                    System.out.println("Enter value for height: ");
                    double c = number.nextDouble();

                    //calculation called in result
                    area = ((a + b) / 2) * c;

                    //result of calculation
                    System.out.println("Area of trapezoid = " + area);
                    break;

                //Ellipse
                case 3:
                    //user input
                    System.out.println("Enter value for length a: ");
                    double d = number.nextDouble();
                    System.out.println("Enter value for length b: ");
                    double e = number.nextDouble();

                    //calculation called in result
                    area = (Math.PI * d * e);

                    //result of calculation
                    System.out.println("Area of ellipse = " + area);
                    break;

                //Rectangle
                case 4:
                    //user input
                    System.out.println("Enter value for a: ");
                    double f = number.nextDouble();
                    System.out.println("Enter value for b: ");
                    double g = number.nextDouble();

                    //calculation called in result
                    area = (f * g);

                    //result of calculation
                    System.out.println("Area of rectangle = " + area);
                    break;

                //Parallelogram
                case 5:
                    //user input
                    System.out.println("Enter value for base: ");
                    double h = number.nextDouble();
                    System.out.println("Enter value for height: ");
                    double i = number.nextDouble();

                    //calculation called in result
                    area = (h * i);

                    //result of calculation
                    System.out.println("Area of parallelogram = " + area);
                    break;

                //Triangle
                case 6:
                    //user input
                    System.out.println("Enter value for base: ");
                    double j = number.nextDouble();
                    System.out.println("Enter value for height: ");
                    double k = number.nextInt();

                    //calculation called in result
                    area = (.5 * j * k);

                    //result of calculation
                    System.out.println("Area of triangle = " + area);
                    break;

                //Circle
                case 7:
                    //user input
                    System.out.println("Enter value for radius: ");
                    double r = number.nextDouble();

                    //calculation called in result
                    area = (Math.PI * Math.pow(r, 2));

                    //result of calculation
                    System.out.println("Area of circle = " + area);
                    break;

                default:
                    System.out.println("Goodbye!");
            }
        }
    }
}
