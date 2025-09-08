import java.util.Scanner;

public class Calculadora{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("=== Calculadora ===");
        System.out.println("Informe o primeiro valor:");
        Double valor1 = scan.nextDouble();
        System.out.println("Informe o segundo valor:");
        Double valor2 = scan.nextDouble();

        System.out.println("Escolha a operação (+, -, *, /):");
        char operacao = scan.next().charAt(0);

        Double resultado;

        switch (operacao){
            case '+':
                resultado = valor1 + valor2;
        }
    }
}
