import java.util.*;

public class ifElseProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            if (n >= 2 && 5 >= n){
                System.out.println("Not Weird");
            }
            else if (n >= 6 && 20 >= n) {
                System.out.println("Weird");
            }
            else {
                System.out.println("Not Weird");
            }
        }
        else {
            System.out.println("Weird");
        } sc.close();
    }
}