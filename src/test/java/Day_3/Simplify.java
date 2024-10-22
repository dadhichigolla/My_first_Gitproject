package Day_3;
import java.util.Scanner;

public class Simplify
{
        public  static void D_addation()
        {
            // Create a Scanner object to read input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user for three numbers
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            System.out.print("Enter the third number: ");
            int num3 = scanner.nextInt();

            // Calculate the sum
            int sum = num1 + num2 + num3;

            // Display the result
            System.out.println("The sum of " + num1 + ", " + num2 + ", and " + num3 + " is: " + sum);


        }
}

