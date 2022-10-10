package br.com.main.pilha;

import br.com.model.pilha.Pilha;

import java.util.Scanner;

public class Exercicios_correcao01 {

    public static void main(String[] args)
    {
        Pilha<Integer> stack = new Pilha<>();

        Scanner scan = new Scanner(System.in);

        for (int x = 1; x <= 10; x++)
        {
            System.out.println("Entre com um numero: ");
            int num = scan.nextInt();

            //se for par
            if(num % 2 == 0)
            {
                stack.empilha(num);
                System.out.println("Empilhando o elemento: " + num);
            }
            //é impar
            else
            {
                  Integer vazio = stack.desempilha();
                  if(vazio == null)
                  {
                      System.out.println("Pilha está vazia");
                  }
                  else
                  {

                  }
            }
        }

        if(!stack.estaVazio())
        {
            int desem = stack.desempilha();
            System.out.println("Desempilhando o elemento : " + desem);
        }
    }
}
