import java.util.Scanner;

public class App {
     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Digite a base da piramide: ");
            int numero = scanner.nextInt();
    
            System.out.println("A base da piramide é " + numero + ":");
    
            for (int i = 0; i <= numero; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i);
                }
                System.out.println();
            }
            scanner.close();
    
            System.out.println("\nHello, World!");
        }
    
     
    }
