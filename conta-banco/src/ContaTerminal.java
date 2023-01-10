import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       try (//Conhecer e importar a classe Scanner
           //Exibir as mensagens para o usuario
           //Obter pela classe Scanner os valores digitados no terminal
           //Exibir a mensagem da conta criada
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
        System.out.println("Bem Vindo ao Yagobank. Por favor insira o número da conta criada:");
           int numero = scanner.nextInt();

           System.out.println("Insira o número da agência: ");
           String agencia = scanner.next();

           System.out.println("Insira o seu nome e sobrenome: ");
           String nomeCliente1 = scanner.next();
           String nomeCliente2 = scanner.next();

           System.out.println("Insira o montante desejado: ");
           Double saldo = scanner.nextDouble();

           System.out.println("Olá " + nomeCliente1 + " " + nomeCliente2 + ", obrigado por criar uma conta em nosso banco.");
           System.out.println("Sua agência é " + agencia );
           System.out.println("Sua conta " + numero );
           System.out.println("E seu saldo " + saldo + " já está disponível.");
    }

    }
}

