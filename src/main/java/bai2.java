import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int n, dem = 0;
        int i;
        System.out.println("nhap n: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        i = n;
        while(n > 0 & i > 0){
            if(n % i == 0){
                System.out.print(i + " ");
                dem++;
            }
            i--;
        }
        System.out.println("\n" + dem);
    }
}
