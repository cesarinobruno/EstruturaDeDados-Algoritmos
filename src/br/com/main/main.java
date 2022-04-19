package br.com.main;

import br.com.model.Vetor;

public class main {

    public static void main(String[] args)
    {
        Vetor list = new Vetor(5);

        list.add(26);
        list.add(18);
        list.add(22);

        boolean value = list.existsInCollection(1);

        if(value)
        {
            System.out.println("Elemento existe");
        }
        else
        {
            System.out.println("Elemento não existe");
        }
    }
}
