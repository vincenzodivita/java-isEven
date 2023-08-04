import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Import Scanner
        Scanner scanner = new Scanner(System.in);

        // Ask user a number
        System.out.println("Ciao! Scegli un numero e ti dirò se è pari o dispari");
        int userChoice = scanner.nextInt();
        scanner.nextLine();


        
        System.out.println("Hai scelto il numero " + userChoice);
    
    }
}
