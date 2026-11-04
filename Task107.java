import java.util.Scanner;

public class Task107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("n must be at least 1.");
        } else {
            int total = 0;

            for (int row = 1; row <= n; row++) {
                for (int num = 1; num <= row; num++) {
                    System.out.print(num + " ");
                    total++;
                }
                System.out.println();
            }

            System.out.println("Total numbers printed: " + total);
        }

        sc.close();
    }
}

