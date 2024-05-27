import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome: ");
        String name = scanner.next();

        System.out.println("Digite a sua agência: ");
        int agency = scanner.nextInt();

        System.out.println("Digite a sua conta: ");
        int account = scanner.nextInt();

        System.out.println("Digite o valor que deseja depositar: ");
        double balance = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo %s já está disponível para saque.%n", name, agency, account, balance);
    }
}
