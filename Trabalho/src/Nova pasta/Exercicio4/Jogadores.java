import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador(String nome, int pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void aumentarPontuacao(int quantidade) {
        pontuacao += quantidade;
    }

    public void subirNivel() {
        nivel++;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Nível: " + nivel);
    }
}

class Jogadores {
    private List<Jogador> listaJogadores;

    public Jogadores() {
        this.listaJogadores = new ArrayList<>();
    }

    public void adicionarJogador(String nome, int pontuacao, int nivel) {
        Jogador novoJogador = new Jogador(nome, pontuacao, nivel);
        listaJogadores.add(novoJogador);
        System.out.println("Jogador adicionado com sucesso!");
    }

    public void aumentarPontuacao(String nome, int quantidade) {
        for (Jogador jogador : listaJogadores) {
            if (jogador.getNome().equals(nome)) {
                jogador.aumentarPontuacao(quantidade);
                System.out.println("Pontuação aumentada com sucesso!");
                return;
            }
        }
        System.out.println("Jogador não encontrado!");
    }

    public void subirNivel(String nome) {
        for (Jogador jogador : listaJogadores) {
            if (jogador.getNome().equals(nome)) {
                jogador.subirNivel();
                System.out.println("Nível aumentado com sucesso!");
                return;
            }
        }
        System.out.println("Jogador não encontrado!");
    }

    public void exibirJogadores() {
        System.out.println("Lista de jogadores:");
        for (Jogador jogador : listaJogadores) {
            jogador.exibirInformacoes();
            System.out.println();
        }
    }

    public void consultarInformacoesPorNome(String nome) {
        for (Jogador jogador : listaJogadores) {
            if (jogador.getNome().equals(nome)) {
                jogador.exibirInformacoes();
                return;
            }
        }
        System.out.println("Jogador não encontrado!");
    }
}