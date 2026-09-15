import java.util.Scanner;

public class Dimond_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the number of rows from the user
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        // nsp = number of spaces
        // nst = number of stars
        int nsp = n - 1;
        int nst = 1;

        // ---------------- Upper Half ----------------
        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }

            // Print stars
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }

            // Decrease spaces by 1
            nsp--;

            // Increase stars by 2
            nst += 2;

            System.out.println();
        }

        // ---------------- Lower Half ----------------
        nsp = 1;
        nst = 2 * n - 3;

        // Run n-1 times because the middle row
        // was already printed in the upper half
        for (int i = 1; i < n; i++) {

            // Print spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }

            // Print stars
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }

            // Increase spaces by 1
            nsp++;

            // Decrease stars by 2
            nst -= 2;

            System.out.println();
        }

        // Close Scanner
        sc.close();
    }
}