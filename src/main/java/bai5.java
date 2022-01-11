import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        long n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int res = 0, i;
        while (n > 0) {
            i = (int) (n % 10);
            n /= 10;
            res += i;
        }
        System.out.println(res);
    }
}
