package br.com.main.exercicios;

import br.com.model.exercicios.Vetor;

public class Main
{
    public static void main(String[] args)
    {
        Vetor list = new Vetor(6);

        list.add(10); //0
        list.add(18); //1
        list.add(22); //2
        list.add(30); //3
        list.add(40); //4

        System.out.println("Antes" + list);

        list.remove(1);

        System.out.println("Depois" + list);
    }
}
