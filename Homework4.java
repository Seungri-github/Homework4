import java.awt.Point;
import java.util.Scanner;
public class Homework4 {
    static void swap(Point m, Point n) {
        Point temp1 = new Point(m.x, n.y);
        m.x = n.x;
        m.y = n.y;
        n.x = temp1.x;
        n.y = temp1.y;
    }
    public static int gcd(int m, int n) {
        if (n == 0) { return m; }
        else if (m % n == 0) { return n; }
        else {
            m = m % n;
            //swap(m, n);
            return gcd(n, m % n);
        }
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
