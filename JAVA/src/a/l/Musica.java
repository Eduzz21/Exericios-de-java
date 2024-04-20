package a.l;

public class Musica implements Comparable<Musica>{

    private String titulo;
    private String autor;
    private int ano;

    Musica(String titulo, String autor, int ano) {

        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;

    }

    String getTitulo() {
        return this.titulo;
    }

    String getAutor() {
        return this.autor;
    }

    int getAno() {
        return this.ano;
    }

    @Override
    public String toString() {
        return "[ " + this.getAno() + " ] - " + this.getTitulo() + " - " + this.getAutor() + "";
    }

    @Override  
    public int compareTo(Musica o) {
        return this.autor.compareTo(o.getAutor());
    }
    }
