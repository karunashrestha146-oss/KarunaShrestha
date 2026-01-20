package KarunaShrestha;

import java.util.*;

public class Function8 {
    public static double Circumference(int r) {
        double circumference = 2 * 3.14 * r;
        return circumference;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double circumference = Circumference(r);
        System.out.println("Circumference:" + circumference);
    }
}
