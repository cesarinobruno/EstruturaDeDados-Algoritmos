package br.com.main;

import br.com.pilha.Pilha;

public class aula13
{
    public static void main(String[] args)
    {
        Pilha<Integer> pilha = new Pilha<Integer>();

        pilha.empilha(20);
        pilha.empilha(30);
        pilha.empilha(40);
        pilha.empilha(50);
        pilha.empilha(60);

        System.out.println(pilha.getTamanho());
        System.out.println(pilha.verificarTopoPilha());

        System.out.println("Desempilhando o elemento: " + pilha.desempilha());

        System.out.println(pilha.getTamanho());
        System.out.println(pilha.verificarTopoPilha());
    }
}
