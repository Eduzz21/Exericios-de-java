import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jogadores jogadores = new Jogadores();

        int opcao;
        do {
            System.out.println("Escolha uma opção:\n");
            System.out.println("1. Criar novo jogador");
            System.out.println("2. Aumentar pontuação");
            System.out.println("3. Subir de nível");
            System.out.println("4. Consultar informações de jogador");
            System.out.println("5. Sair");

            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    criarNovoJogador(scanner, jogadores);
                    break;
                case 2:
                    aumentarPontuacao(scanner, jogadores);
                    break;
                case 3:
                    subirNivel(scanner, jogadores);
                    break;
                case 4:
                    consultarInformacoesPorNome(scanner, jogadores);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);

        scanner.close();
    }

    private static void criarNovoJogador(Scanner scanner, Jogadores jogadores) {
        scanner.nextLine(); 
        System.out.println("Digite o nome do jogador:");
        String nome = scanner.nextLine();
        System.out.println("Digite a pontuação inicial do jogador:");
        int pontuacao = scanner.nextInt();
        System.out.println("Digite o nível inicial do jogador:");
        int nivel = scanner.nextInt();
        jogadores.adicionarJogador(nome, pontuacao, nivel);
        System.out.println("Jogador criado com sucesso!");
    }

    private static void aumentarPontuacao(Scanner scanner, Jogadores jogadores) {
        scanner.nextLine(); 
        System.out.println("Digite o nome do jogador:");
        String nome = scanner.nextLine();
        System.out.println("Digite a quantidade de pontuação a ser aumentada:");
        int quantidade = scanner.nextInt();
        jogadores.aumentarPontuacao(nome, quantidade);
    }

    private static void subirNivel(Scanner scanner, Jogadores jogadores) {
        scanner.nextLine(); 
        System.out.println("Digite o nome do jogador:");
        String nome = scanner.nextLine();
        jogadores.subirNivel(nome);
    }

    private static void consultarInformacoesPorNome(Scanner scanner, Jogadores jogadores) {
        scanner.nextLine(); 
        System.out.println("Digite o nome do jogador que deseja consultar:");
        String nome = scanner.nextLine();
        jogadores.consultarInformacoesPorNome(nome);
    }
}