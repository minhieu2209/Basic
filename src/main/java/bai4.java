import java.util.Scanner;

public class bai4 {
    public static int UCLN(int a, int b) {
        if (b == 0) return a;
        return UCLN(b, a % b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        a = in.nextInt();
        b = in.nextInt();
        for (int i = a; i < b; i++) {
            for (int j = i + 1; j <= b; j++) {
                if (UCLN(i, j) == 1) System.out.println(i + " " + j);
            }
        }
    }
}
