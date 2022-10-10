package br.com.main.pilha;

public class Livro
{
    private String nome;
    private String isbn;
    private int ano;
    private String autor;

    public Livro(){}

    public Livro(String nome, String isbn, int ano, String autor)
    {
        this.nome = nome;
        this.isbn = isbn;
        this.ano = ano;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", isbn='" + isbn + '\'' +
                ", ano=" + ano +
                ", autor='" + autor + '\'' +
                '}';
    }
}
