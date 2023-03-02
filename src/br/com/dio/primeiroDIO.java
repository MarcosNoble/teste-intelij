package br.com.dio;
import model.Gato;

public class primeiroDIO {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println( gato);
        Livro livro1 = new  Livro("The dark tower", 300);
        System.out.println(livro1);
        /* int a = 5;
        int b = 3;
        System.out.println("this shit again" + (a+b));*/

    }
}

class Livro{
    private String nome;
    private int numPaginas;

    public Livro(String nome, int numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
}