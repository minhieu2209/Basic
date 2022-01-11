import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        if(n == 1) System.out.println(n);
        else {
            int i = 2;
            while(n != 1){
                if(n % i == 0){
                    System.out.print(i + " ");
                    n/= i;
                }
                else i++;
            }
        }
    }
}
