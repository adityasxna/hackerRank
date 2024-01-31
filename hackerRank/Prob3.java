import java.util.*;

public class Prob3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 2 && 20 >= n){
            for (int i = 1; i < 11; i++) {
                int x = n*i;
                System.out.println(n + " x " + i + " = " + x);
            }
        }
        else {
            System.out.println("Invalid input");
        } sc.close();
    }
}
