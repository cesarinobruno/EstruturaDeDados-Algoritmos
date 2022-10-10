package br.com.main.pilha;

import br.com.model.pilha.Pilha;

import java.util.Scanner;

public class Exercicios_pilha01 {

    public static void main(String[] args)
    {
        Pilha<Integer> stack = new Pilha<>();

        Scanner scan = new Scanner(System.in);
        Integer numero;

        int i = 10;

        while (stack.getTamanho() <= i)
        {
            System.out.println("Digite um número: \n");
            numero = scan.nextInt();

            if (numero % 2 == 0)
            {
                System.out.println("Empilhando o numero: " + numero);
                stack.empilha(numero);
            }
            else
            {
                if(stack.verificarTopoPilha() != null)
                {
                    Integer desempilha = stack.desempilha();
                    System.out.println("Desempilhando o numero: " + desempilha);
                }
                else
                {
                    System.out.println("A pilha está vazia: " + stack.getTamanho());
                    return;
                }
            }
        }
        i++;

        if(stack.getTamanho() > 0)
        {
            while (stack.getTamanho() != 0)
            {
                System.out.println("Desempilhando o elemento : " + stack.desempilha());
            }
            i--;
        }
    }
}
