package br.com.main;

import br.com.model.Vetor;

public class main {

    public static void main(String[] args)
    {
        Vetor list = new Vetor(5);

        list.add(10);
        list.add(18);
        list.add(22);

        System.out.println("Antes: " + list);

        list.add(15, 1);

        System.out.println("Depois: " + list);

    }
}
