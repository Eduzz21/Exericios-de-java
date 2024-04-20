package a.l;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        /*
         * List<String> musicas = new ArrayList<String>();
         * musicas.add("Back in Black");
         * musicas.add("Living on prayer");
         * musicas.add("Camisa 10");
         * musicas.add("Caneta Azul");
         * musicas.add("Beat It");
         * 
         * System.out.println(musicas);
         * 
         * Collections.sort(musicas);
         * 
         * System.out.println(musicas);
         */

        List<Musica> musicas = new ArrayList<>();
        musicas.add(new Musica("Black in Black", "Bon jovi", 1999));
        musicas.add(new Musica("Living on a prayer", "ACDC", 1980));
        musicas.add(new Musica("Camisa 10", "Thiaguinho", 2010));
        musicas.add(new Musica("Caneta Azul", "Manoel Gomes", 2020));
        musicas.add(new Musica("Beat", "Michael Jackson", 1982));

        for (int i = 0; i < musicas.size(); i++) {
            System.out.println(musicas.get(i));

        }

        System.out.println("");

    }

}