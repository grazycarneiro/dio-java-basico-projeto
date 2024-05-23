import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {


        // Conhecer e importar a classe Scanner 
        // Exibir as mensagens para o novo usuário 
        //Obter pelo scanner os valores digitados no terminal
        // Exibir a mensagem conta criada 
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, seja bem vindo. Por favor digite o número da conta.");
        int conta = scanner.nextInt();

        System.out.println("Por favor digite o número da agência.");
        String agencia = scanner.next();

        System.out.println("Por favor digite seu Nome");
        String nome = scanner.next();

        System.out.println("Por favor digite seu Sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Por favor digite seu Saldo Inicial");
        double saldoInicial = scanner.nextDouble();

        System.out.println("Olá " + nome + " " + sobrenome +". Obrigada por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + conta + " e seu saldo R$" + saldoInicial + " já está disponível para saque. ");  
    
    

    }
}
