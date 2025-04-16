import java.util.Locale;
import java.util.Scanner;

public class AbouteMe {
    public static void main(String[] args) {
        //criando um objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine(); //lê o nome do usuário
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine(); //lê o sobrenome do usuário
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt(); //lê a idade do usuário
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble(); //lê a altura do usuário

        // sem usar o scanner, podemos usar os argumentos passados na linha de comando
        // String nome = args[0]; 
        // String sobrenome = args[1]; 
        // int idade = Integer.parseInt(args[2]); 
        // double altura = Double.valueOf(args[3]);
        
        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Eu tenho " + idade + " anos");
        System.out.println("Eu tenho " + altura + " metros de altura");

    }
}
