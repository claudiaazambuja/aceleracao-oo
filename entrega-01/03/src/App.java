import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero tabuada que sera referenciada: ");
        int numero = scanner.nextInt();

        System.out.println("Abaixo a tabuado do valor de " + numero + ":");

        for (int i = 0; i < 10; i++) {
            System.out.print(numero + "x" + i + "=" + (numero*i) + "");
            System.out.println();
        }
        scanner.close();

        System.out.println("\nHello, World!");
    }

    
}
