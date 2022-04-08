package br.com.main;

import br.com.model.Vetor;

public class main {

    public static void main(String[] args)
    {
        Vetor list = new Vetor(5);

        list.add(-6);
        list.add(26);
        list.add(18);
        list.add(0);

        System.out.println(list);
    }
}
