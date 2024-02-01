import java.util.*;

public class Prob7 {
    public static void main(String[] args){
        String rev = "";
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        sc.close();
    }   
}
