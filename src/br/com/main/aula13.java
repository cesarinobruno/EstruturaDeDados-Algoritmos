package br.com.main;

import br.com.pilha.Pilha;

public class aula13
{
    public static void main(String[] args)
    {
        Pilha<Integer> pilha = new Pilha<Integer>();

        System.out.println(pilha.toString());
        System.out.println(pilha.getTamanho());
    }
}
