
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bom dia! Bem vindo ao nosso banco. Qual o seu nome? ");
        String nome = scanner.nextLine();

        System.out.println("Você poderia digitar o numero da sua Agencia? ");
        String agencia = scanner.nextLine();

        System.out.println("E o numero da sua conta corrente? ");
        String numero = scanner.nextLine();

        System.out.println("Agora para finalizar, qual será o valor do seu deposito?");
        Double saldo = scanner.nextDouble();    

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$ %s já está disponível para saque.",nome,agencia,numero,saldo.toString());
    }
}
