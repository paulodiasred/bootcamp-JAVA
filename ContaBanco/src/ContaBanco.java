import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o numero da Agência! ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o numero da Conta! ");
        int conta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + 
        " e seu saldo " + saldo + " já está disponivel para saque!");

        scanner.close();
    }
}
