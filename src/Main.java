import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define Scanner method
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask user a number
            System.out.println("Ciao! Scegli un numero e ti dirò se è pari o dispari!");
            int userChoice = scanner.nextInt();
            scanner.nextLine();
    
            // IF ELSE statement
            if (userChoice % 2 == 0) {
    
                System.out.println("Il numero da te scelto (" + userChoice + ") è un numero pari!");
    
            } else {
               
                System.out.println("Il numero da te scelto (" + userChoice + ") è un numero dispari!"); 
    
            }
        }
        
        catch(InputMismatchException e){
            System.out.println("Mi dispiace, non puoi inserire del testo ma soltanto numeri interi!");
        }

        finally {
            scanner.close();
        }
    
    }
}
