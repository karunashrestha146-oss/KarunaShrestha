package KarunaShrestha;

import java.util.*;

public class Function7 {
    public static int GreaterNumber(int a, int b) {
        int greater = 0;
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int greater = GreaterNumber(a, b);
        System.out.println(greater);

    }

}
