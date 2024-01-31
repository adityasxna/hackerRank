import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three integers separated by spaces
        System.out.println("Enter three integers separated by spaces:");

        // Read the input line
        String inputLine = scanner.nextLine();

        // Create a Scanner for the input line
        Scanner inputScanner = new Scanner(inputLine);

        // Read the three integers and assign them to variables a, b, and c
        int a = inputScanner.nextInt();
        int b = inputScanner.nextInt();
        int c = inputScanner.nextInt();

        // Close the scanners
        inputScanner.close();
        scanner.close();

        // Print the values of variables a, b, and c
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }
}
