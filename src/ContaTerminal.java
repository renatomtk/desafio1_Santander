import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da conta.");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor, digite o número da agência.");
        String agencia = sc.nextLine();
        System.out.println("Por favor, digite o seu nome.");
        String cliente = sc.nextLine();
        System.out.println("Por favor, digite o saldo da conta.");
        double saldo = sc.nextDouble();
        sc.close();

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}