import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int n, i = 0;
        float b = 0;
        System.out.println("nhap n: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println("a hay b?");
        System.out.println("a cho.n 1, b cho.n 2 nhe' ^^");
        int a = in.nextInt();
        switch (a) {
            case 1:
                while (n > 0) {
                    i += n;
                    n -= 2;
                }
                System.out.println(i);
                break;
            case 2:
                while(n > 0){
                    b += 1.0/n;
                    n--;
                }
                System.out.println(b);
                break;
        }
    }
}
