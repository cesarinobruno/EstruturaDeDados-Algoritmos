package br.com.main.pilha;

import br.com.model.pilha.Pilha;

public class Exercicio_03
{
    public static void main(String[] args)
    {

        Pilha<Livro> pilha = new Pilha<>(20);

        Livro livro1 = new Livro("O Batman", "ISBN internation01", 2022, "Leonardo");
        Livro livro2 = new Livro("O Robben", "ISBN internation02", 2032, "Amaro");
        Livro livro3 = new Livro("O Batman", "ISBN internation03", 2042, "Caio");
        Livro livro4 = new Livro("O Batman", "ISBN internation04", 2052, "Fernando");
        Livro livro5 = new Livro("O Batman", "ISBN internation05", 2062, "Mauricio");
        Livro livro6 = new Livro("O Batman", "ISBN internation06", 2072, "Bruno");

        pilha.empilha(livro1);
        pilha.empilha(livro2);
        pilha.empilha(livro3);
        pilha.empilha(livro4);
        pilha.empilha(livro5);
        pilha.empilha(livro6);

        System.out.println(pilha);
    }
}
