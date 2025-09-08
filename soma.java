  import java.util.Scanner;


public class soma {

    static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("digite o primeiro numero: ");
        int numero1 = sc.nextInt();
        System.out.println("digite o segundo numero: ");
        int numero2 = sc.nextInt();

        int soma = numero1 + numero2;
        System.out.println("resultando: "+soma);

        sc.close();
    }
}
