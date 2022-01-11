public class bai7 {
    public static boolean ngto(int a) {
        if (a <= 1) return false;
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) return false;
            }
        return true;
    }

    public static boolean chusole(int a) {
        int b = 0, dem = 0;
        while (a > 0) {
            b = a % 10;
            if (b % 2 == 1) dem++;
            a /= 10;
        }
        if (dem == 6) return true;
        else return false;
    }

    public static void main(String[] args) {
        int dem = 0;
        for (int i = 100000; i < 999999; i++) {
            if (ngto(i) && chusole(i)) {
                System.out.println(i);
                dem++;
            }
        }
        System.out.println(dem);
    }
}
