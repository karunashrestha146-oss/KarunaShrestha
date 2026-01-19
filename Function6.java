package KarunaShrestha;

import java.util.*;

public class Function6 {
    public static int SumOfOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sum = sum + i;

            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = SumOfOdd(n);
        System.out.println("The sum of odd numbers is: " + sum);
    }

}
