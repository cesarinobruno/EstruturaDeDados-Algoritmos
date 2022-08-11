package br.com.main;

import br.com.model.Vetor;

public class main {

    public static void main(String[] args)
    {
        Vetor list = new Vetor(10);

        list.add(10); //0
        list.add(15); //1


//        boolean exists = list.existsInCollection(4);
        Integer result = list.lastIndexOf();

        System.out.println("resultado: " + result);

    }
}
