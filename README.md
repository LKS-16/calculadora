# calculadora
import java.util.Scanner;

public class Calculadora{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("=== Calculadora ===");
        System.out.println("Informe o primeiro valor:");
        int valor1 = scan.nextInt();
        System.out.println("Informe o segundo valor:");
        int valor2 = scan.nextInt();

        System.out.println("Escolha a operação (+, -, *, /):");
        char operacao = scan.next().charAt(0);
    }
}
