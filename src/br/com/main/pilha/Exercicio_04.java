package br.com.main.pilha;

import br.com.model.pilha.Pilha;

import java.util.Scanner;

public class Exercicio_04
{
    static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        Pilha<String> pilha = new Pilha<>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra para verificar se é palíndromo? \n");

        boolean empilhou = pilha.empilha(scan.next());

        if(empilhou != false)
        {
            boolean isPalindrome = isPalindrome(pilha.verificarTopoPilha());
            if(isPalindrome)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
