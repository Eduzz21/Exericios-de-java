package JAVA;
import java.util.Scanner;

public class Personagem {
    private int posX;
    private int posY;
    private String desenho;

    Personagem (int posX, int posY, String desenho) {

        this.posX = posX;
        this.posY = posY;
        this.desenho = desenho;
    }
    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public String getDesenho() {
        return desenho;
    }


}

