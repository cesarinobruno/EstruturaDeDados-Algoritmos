package br.com.main;

import br.com.model.Vetor;

public class main {

    public static void main(String[] args)
    {
        Vetor list = new Vetor(10);

        list.add(10); //0
        list.add(15); //1
        list.add(30); //2
        list.add(45); //3
        list.add(85); //4
        list.add(10); //5

        Integer result = list.lastIndexOf(10);

        System.out.println("resultado: " + result);

    }
}
