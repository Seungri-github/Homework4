import java.util.Scanner;
public class Homework4 {
    static int gcd(int m, int n) {
        if (n == 0) return m;
        if (m > n) return gcd(n, m%n);
        else return gcd(m, n%m);
    }
    static int gcd2(int a, int b) {
        int tmp;
        //큰 수가 앞으로 오도록
        if(a < b) {
            tmp = a;
            a = b;
            b = tmp;
        }

        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("두 수를 입력하세요: ");

        int m = sc.nextInt();
        int n = sc.nextInt();

        int d = gcd(m, n);

        System.out.printf("두 수의 최대공약수는 %d입니다.", d);
    }
}
