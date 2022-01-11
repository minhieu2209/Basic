public class bai9 {
    public static boolean sothuannghich(int n) {
        int dao = 0;
        int m = n;
        while (n > 0) {
            dao = 10 * dao + n % 10;
            n /= 10;
        }
        if (m == dao) return true;
        return false;
    }

    public static boolean ktra(int n) {
        int i = 0, res = 0;
        while (n > 0) {
            i = n % 10;
            if (i != 0 && i != 6 && i != 8) return false;
            else {
                n /= 10;
                res += i;
            }
        }
        if(res % 10 == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        for (int i = 1000000; i < 999999999; i++) {
            if (ktra(i) && sothuannghich(i)) System.out.println(i);
        }
    }
}
