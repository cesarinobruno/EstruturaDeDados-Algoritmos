package br.com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Exercicios_pilha02 {

    public static void main(String[] args)
    {
        Stack<Integer> par = new Stack<>();
        Stack<Integer> impar = new Stack<>();

        for (Integer c = 0; c <= 10; c++)
        {
            if(c.compareTo(2) == 0 || c.compareTo(4) == 0 || c.compareTo(6) == 0
                    || c.compareTo(8) == 0 || c.compareTo(10) == 0)
            {
                par.push(c);
            }
            else if(c.compareTo(1) == 0 || c.compareTo(3) == 0 || c.compareTo(5) == 0
                    || c.compareTo(7) == 0 || c.compareTo(9) == 0)
            {
                impar.push(c);
            }
            else if (c.compareTo(0) == 0)
            {
                if(par.isEmpty() || impar.isEmpty())
                {
                    System.out.println("Alguma das pilhas estao vazias");
                }
                else
                {
                    par.pop();
                    impar.pop();
                }

            }
        }

        System.out.println(par);
        System.out.println(impar);
    }
}
