import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    private ArrayList<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Scanner scanner) {
        System.out.println("Perfeito, quantos livros você deseja adicionar? ");
        int qtdLivros = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < qtdLivros; i++) {
            System.out.println("Informe o título/nome do livro: ");
            String nomeLivro = scanner.nextLine();

            System.out.println("Informe o nome do autor: ");
            String nomeAutor = scanner.nextLine();

            System.out.println("Informe o ano de lançamento: ");
            int anoLivro = Integer.parseInt(scanner.nextLine());

            Livro novoLivro = new Livro(nomeLivro, anoLivro, nomeAutor);
            livros.add(novoLivro);

            System.out.println("Livro adicionado com sucesso!");
        }
    }

    public void consultarLivro(Scanner scanner) {
        System.out.println("Por favor, informe o nome/título do livro que deseja consultar: ");
        String nomeLivroConsulta = scanner.nextLine();

        boolean livroEncontrado = false; // iniciando em falso pois como nao percorreu ainda ele só vai da true quando percorrer o banco de dados do cod

        for (Livro livro : livros) {
            if (livro.getNomeLivro().equalsIgnoreCase(nomeLivroConsulta)) {
                System.out.println("Livro encontrado:");
                System.out.println("Título: " + livro.getNomeLivro());
                System.out.println("Autor: " + livro.getNomeAutor());
                System.out.println("Ano de lançamento: " + livro.getAnoLivro());
                livroEncontrado = true;
                break;
            }
        }

        if (!livroEncontrado) {
            System.out.println("O livro não foi encontrado na biblioteca.");
        }
    }
}

class Livro { //declarando as variaveis e a função do livro
    private String nomeLivro;
    private int anoLivro;
    private String nomeAutor;

    public Livro(String nomeLivro, int anoLivro, String nomeAutor) {
        this.nomeLivro = nomeLivro;
        this.anoLivro = anoLivro;
        this.nomeAutor = nomeAutor;
    }
// aqui estou retornando as informaçoes que eu ja tenho armazenada na lista
    public String getNomeLivro() {
        return nomeLivro;
    }

    public int getAnoLivro() {
        return anoLivro;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }
}