package br.com.main;

import java.util.Stack;

public class Exercicios_pilha01 {

    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();

        for (int x = 1; x <= 10; x++)
        {
            if (x == 2 || x == 4
                    || x == 6 || x == 8 || x == 10)
            {
                stack.push(x);
            }

            if(x == 1 || x == 3 || x == 5 ||
                    x == 7 || x == 9)
            {
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
                else
                {
                    System.out.println("Pilha vazia");
                }
            }
        }
    }
}
