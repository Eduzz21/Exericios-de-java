import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca(); // Criando uma instância da classe Biblioteca

        System.out.println("~~~~~~~ Bem Vindo a Biblioteca!! ~~~~~~~");
        int opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Consultar Livro");
            System.out.println("0. Sair..... Volte sempre!!!!");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    biblioteca.adicionarLivro(scanner); // Chamando o método adicionarLivro da instância da classe Biblioteca
                    break;
                case 2:
                    biblioteca.consultarLivro(scanner); // Chamando o método consultarLivro da instância da classe Biblioteca
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}