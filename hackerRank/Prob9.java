import java.util.*;

public class Prob9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while (sc.hasNextLine()) {
            System.out.println(count++ + " " + sc.nextLine());
        }
        sc.close();
    }
}
