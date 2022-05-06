package br.com.main;

import br.com.model.Vetor;

public class main {

    public static void main(String[] args)
    {
        Vetor list = new Vetor(5);

        list.add(10); //0
        list.add(18); //1
        list.add(22); //2
        list.add(30); //3
        list.add(40); //4

        list.add(100);


        System.out.println(list);

    }
}
