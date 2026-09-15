import java.util.Scanner;

public class rhombus {
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter Number :");

        // Store the user's input in variable n
        int n = sc.nextInt();

        // Outer loop: controls the number of rows
        for (int i = 1; i <= n; i++) {

            // First inner loop: prints spaces before stars
            // n - i means spaces decrease in every row
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }

            // Second inner loop: prints stars
            // n means the same number of stars in every row
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }

            // Move to the next line after completing one row
            System.out.println();
            sc.close();
        }
    }
}