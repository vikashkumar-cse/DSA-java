import java.util.Scanner;

public class starfillpe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();
        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=n;j++){
        // methode -01 esye fromet
        // if((i+j)>n){
        // System.out.print("* ");
        // }
        // else System.out.print(" ");
        // methode -02 ek loop ke ander do loop using the star tringle vertically
        // flipped
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
                // Qustion -01
                // 1
                // 1 2
                // 1 2 3
                // 1 2 2 4
                // System.out.print(j+" ");

            }
            System.out.println(" ");
            sc.close();
        }
    }
}
