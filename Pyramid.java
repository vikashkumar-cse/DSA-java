import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter the number :");

        // Store the input in variable n
        int n = sc.nextInt();

        // Outer loop: controls the number of rows
        for (int i = 1; i <= n; i++) {

            // First inner loop: prints spaces
            // n - i spaces are printed in each row
            // Spaces decrease as the row number increases
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Second inner loop: prints stars
            // 2 * i - 1 stars are printed in each row
            // Stars increase by 2 in every row
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            // Move to the next line after completing one row
            System.out.println();
            sc.close();
        }
    }
}