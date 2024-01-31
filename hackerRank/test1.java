import java.util.*;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        sc.nextLine();  // Consume the newline character
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            String inputLine = sc.nextLine();
            Scanner inputScanner = new Scanner(inputLine);
            int a = inputScanner.nextInt();
            int b = inputScanner.nextInt();
            int c = inputScanner.nextInt();

            for (int x = a + b, y = b; x > c + 1; y = 2 * b, x = x + y) {
                list.add(x);
            }
            inputScanner.close();
        }
        sc.close();
        System.out.println(list);
        
    }
}
