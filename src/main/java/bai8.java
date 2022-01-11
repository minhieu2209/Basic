import java.util.Scanner;
public class bai8 {
    public static boolean sothuannghich(int n){
        int dao = 0;
        int m = n;
        while(n > 0){
            dao = 10 * dao + n % 10;
            n /= 10;
        }
        if(m == dao) return true;
        return false;
    }
    public static void phan_a() {
        for (int i = 100000; i < 999999; i++) {
            if (sothuannghich(i)) System.out.println(i);
        }
    }
    public static boolean ktra(int n){
        int i = 0, res = 0;
        while(n > 0){
            i = n % 10;
            n /= 10;
            res += i;
        }
        if(res % 10 == 0) return true;
        return false;
    }
    public static void phan_b() {
        for (int i = 100000; i < 999999; i++) {
            if (sothuannghich(i) && ktra(i)) System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("a hay b?");
        System.out.println("a cho.n 1, b cho.n 2 nhe' ^^");
        int c = in.nextInt();
        switch (c) {
            case 1:
                phan_a();
                break;
            case 2:
              phan_b();
                break;
        }
    }
}
