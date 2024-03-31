import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema bancário!");

        System.out.print("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();
        
        // Limpar o buffer após a leitura de saldoInicial
        scanner.nextLine();

        ContaBancaria conta = new ContaBancaria(nomeCliente, numeroConta, saldoInicial);


                System.out.print("\nOlá " + nomeCliente + ", Conta " + numeroConta + ", que bom te ver novamente!!!!\n");
                System.out.print("\nEscolha uma das opções:\n");
                System.out.print("1. Consultar Saldo\n");
                System.out.print("2. Depositar\n");
                System.out.print("3. Sacar\n");
                System.out.print("4. Sair\n");

        int opcao;
        opcao = Integer.parseInt(scanner.nextLine());


        switch (opcao) {

            case 1:
                System.out.println("Saldo atual: " + conta.consultarSaldo());
                break;
            case 2:
                System.out.print("Digite o valor a ser depositado: ");
                double valorDeposito = scanner.nextDouble();
                conta.depositar(valorDeposito);
                break;
            case 3:
                System.out.print("Digite o valor a ser sacado: ");
                double valorSaque = scanner.nextDouble();
                conta.sacar(valorSaque);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}

        
    
