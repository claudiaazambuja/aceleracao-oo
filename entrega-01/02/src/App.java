import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero da sequencia desejada: ");
        int numero = scanner.nextInt();

        System.out.println("Sequência de Fibonacci de tamanho " + numero + ":");

        for (int i = 0; i < numero; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }
        scanner.close();

        System.out.println("Hello, World!");
    }

    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}
