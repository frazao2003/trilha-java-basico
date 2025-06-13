import entity.Conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o número da conta: ");
        String number = scanner.next();

        System.out.println("Digite o seu saldo atual: ");
        Double balance = scanner.nextDouble();

        Conta conta = new Conta(agencia, number , nomeCliente, balance);

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque \n",
                conta.getClientName(), conta.getAgency(), conta.getNumber(), conta.getBalance());

        System.out.println("---------------------------------------------------------");

        System.out.println("Você deseja sacar ou depositar ?(s | d)");
        String option = scanner.next();

        System.out.println("---------------------------------------------------------");

        System.out.println("Digite o valor: ");
        Double valor = scanner.nextDouble();

        if(option.equals("s")){
            conta.saque(valor);
        } else if (option.equals("d")) {
            conta.deposito(valor);
        }

        System.out.println("---------------------------------------------------------");

        System.out.printf("Novo saldo: %s", conta.getBalance());

    }
}