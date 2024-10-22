package Day_2;

import java.util.Scanner;

public class Even_odd {
    public static void ENum()
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int M1 = reader.nextInt();
        if (M1 % 2 == 0)
            System.out.println(M1 + " is Even");
        else
            System.out.println(M1+ " is odd");
    }
}
