public class bai10 {
    public static boolean ngto(int a) {
        if (a <= 1) return false;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) return false;
        }
        return true;
    }

    public static int dao(int n) {
        int dao = 0;
        while (n > 0) {
            dao = 10 * dao + n % 10;
            n /= 10;
        }
        return dao;
    }

    public static boolean ktra(int n) {
        int i;
        while (n > 0) {
            i = n % 10;
            if (!ngto(i)) return false;
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 1000000; i < 9999999; i++) {
            if (ngto(i) && ktra(i) && ngto(dao(i))) System.out.println(i);
        }
    }
}
