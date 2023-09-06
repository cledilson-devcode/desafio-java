import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String confirmar = null;

        String nomeCliente = null;
        String agencia = null;
        int numeroConta = 0;
        double saldo = 0.0;


        while (!"s".equalsIgnoreCase(confirmar) ){
            System.out.println("Digite o seu nome: ");
            nomeCliente = scan.next();
            System.out.println("Digite sua agencia: ");
            agencia = scan.next();
            System.out.println("Digite o número da conta: ");
            numeroConta = scan.nextInt();
            System.out.println("Digite seu saldo: ");
            saldo = scan.nextDouble();

            System.out.println("Confirme se os seus dados estão corretos");
            System.out.println("'s' para sim / 'n' para não");
            confirmar = scan.next();

        }

        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta "+ numeroConta +" e seu saldo R$"+ saldo+" já está disponível para saque");




    }

}