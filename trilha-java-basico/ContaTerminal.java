import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args){
    try(Scanner scan = new Scanner(System.in)){

        System.out.println("Por favor, digite o seu primeiro nome:");
            String nome = scan.next();
        System.out.println("Informe o número da sua conta:");
            int conta = scan.nextInt();
        System.out.println("Agora digite o número da agência:");
            String agencia = scan.next();
        System.out.println("Por fim, informe o valor do seu saldo:");
            double saldo = scan.nextDouble();
        System.out.println("Olá, " + nome + " " + "! " + "Obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
        }
    }
}