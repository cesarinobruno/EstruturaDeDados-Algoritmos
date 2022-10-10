package br.com.main.pilha;

import br.com.model.pilha.Pilha;

import java.util.Scanner;

public class Exercicios_pilha02 {

    public static void main(String[] args)
    {
        Pilha<Integer> par = new Pilha<>();
        Pilha<Integer> impar = new Pilha<>();
        Scanner scan = new Scanner(System.in);

        for (int x = 1; x <= 10; x++)
        {
            System.out.println("Entre com um numero: ");

            int numero = scan.nextInt();

            if(numero > 0 && numero % 2 == 0)
            {
                par.empilha(numero);
            }
            else if (numero == 0)
            {
                Integer statusPar = par.desempilha();
                Integer statusImpar = impar.desempilha();

                if(statusPar == null || statusImpar == null)
                {
                    System.out.println("Error: Algumas das pilhas estão vazias: " + par.verificarTopoPilha() + "-" + impar.verificarTopoPilha());
                    return;
                }
                System.out.println("Desempilhando do par o número: " + par.verificarTopoPilha());
                System.out.println("Desempilhando do imarpar o número: " + impar.verificarTopoPilha());
            }
            else
            {
                impar.empilha(numero);
            }
        }

        System.out.println("Elementos par: " + par);
        System.out.println("Elementos impar: " + impar);
    }
}
