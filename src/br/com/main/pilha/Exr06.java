package br.com.main.pilha;

import br.com.model.pilha.Pilha;

public class Exr06
{
    public static void main(String[] args)
    {
        imprimeResultado("(A + B)");
        imprimeResultado("A + B + (C - D)");
        imprimeResultado("{[()]}");
    }

    public static void imprimeResultado(String exp)
    {
        System.out.println(exp + " está balanceado? " + verificaSimbolosBalanceados(exp));
    }

    final static String ABRE = "([{";
    final static String FECHA = ")]}";

    public static boolean verificaSimbolosBalanceados(String exp)
    {
        Pilha<Character> pilha = new Pilha<>();
        int index = 0;
        char simbolo, topo;

        while (index < exp.length())
        {
            simbolo = exp.charAt(index);

            if (ABRE.indexOf(simbolo) > -1 && pilha.estaVazio())
            {
                pilha.empilha(simbolo);
            }

            else if (FECHA.indexOf(simbolo) > -1 && pilha.verificarTopoPilha() != null)
            {
                topo = pilha.desempilha();

                if(ABRE.indexOf(topo) != FECHA.indexOf(simbolo))
                {
                    return false;
                }
            }
            index++;
        }
        return true;
    }
}
