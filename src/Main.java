
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String firstName = "";
        String lastName = "";
        String fullName = "";
        int favNum = 0;
        String trash = "";

        Scanner in = new Scanner(System.in);

       // This is the way that we do a prompt using print instead of println
        System.out.println("Enter your first name: ");
        firstName = in.nextLine();

        System.out.println("Your told be your first name is " + firstName);

        System.out.println("Enter your lastname name: ");
        lastName = in.nextLine();

        System.out.println("Your told be your first name is " + lastName);

        fullName = firstName + " " + lastName;

        System.out.print("Enter a number [1- 10]: ");
        if (in.hasNextInt());
        {
            // Clear the newline /Enter from the buffer

            favNum = in.nextInt();
            System.out.println("You said your num is: " + favNum);
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered " + trash);
            System.out.println("Please redo the program and input properly. ");
        }
    }
}