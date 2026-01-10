package KarunaShrestha;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a + b;
        int diff = b - a;
        int mul = a * b;
        int div = b / a;
        int mod = b % a;
        int ans = (a * b) / (a - b);
        int answ = a * b / a - b;
        System.out.println("The value of ans is:" + ans);
        System.out.println("The value of answ is:" + answ);
        System.out.println("The modulus of a and b is:" + mod);
        System.out.println("The multiplication of a and b is:" + mul);
        System.out.println("The division of a and b is:" + div);
        System.out.println("The difference of a and b is:" + diff);
        System.out.println("The sum of a and b is:" + sum);
    }
}