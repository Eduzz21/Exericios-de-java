package JAVA;

import java.util.Scanner;

public class Main {

    public static void Tabuleiro(int largura, int altura,String desenhojogador, Personagem jogador, int getPosX, int getPosY) {
        for (int lin = 0; lin < altura; lin++) {
            System.out.println("");
            System.out.print("[ . ]");

            for (int col = 0; col < largura; col++) {
                if (col == jogador.getPosX() && lin == jogador.getPosY()) {
                    System.out.print("[ " + jogador.getDesenho() + " ]");
                } else {
                    System.out.print("[ . ]");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a Largura do Tabuleiro");
        int largura = scanner.nextInt();

        System.out.println("Informe a Altura do Tabuleiro");
        int altura = scanner.nextInt();

        System.out.println("Informe o desenho do jogador");
        String desenhojogador = scanner.next();


        System.out.println("Informe a posição X do jogador");
        int getPosX = scanner.nextInt();

        System.out.println("Informe a posição Y do jogador");
        int getPosY = scanner.nextInt();

        

        Personagem jogador = new Personagem(jogadorPosX, jogadorPosY, desenhoJogador)

        Tabuleiro(largura, altura, desenhojogador, jogador, getPosX, getPosY);
    }
}
