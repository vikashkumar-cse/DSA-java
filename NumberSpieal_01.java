import java.util.Scanner;

public class NumberSpieal_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        // Total rows = 2*n - 1
        for (int i = 1; i <= 2 * n - 1; i++) {

            // Total columns = 2*n - 1
            for (int j = 1; j <= 2 * n - 1; j++) {

                // Store current row and column
                int a = i, b = j;

                // If row is below the middle,
                // mirror it from the bottom
                if (i > n)
                    a = 2 * n - i;

                // If column is after the middle,
                // mirror it from the right
                if (j > n)
                    b = 2 * n - j;

                // Print the smaller value of row and column
                System.out.print(Math.min(a, b) + " ");
            }

            // Move to the next row
            System.out.println();
        }

        // Close Scanner
        sc.close();
    }
}