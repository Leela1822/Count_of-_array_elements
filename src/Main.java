import java.util.Scanner;
public class Main {
    public static int GreaterElements(int[] A) {
        int count = 0;
        int n = A.length;

        for (int i = 0; i < n; i++) {
            int x = A[i];
            boolean foundGreater = false;

            for (int j = 0; j < n; j++) {
                if (A[j] > x) {
                    foundGreater = true;
                    break;
                }
            }

            if (foundGreater) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int n = scanner.nextInt();
        int[] A = new int[n];


        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        scanner.close();

        int output = GreaterElements(A);
        System.out.println("Output: " + output);
    }
}