package br.com.model;

import java.util.Arrays;

//por enquanto sem ser dinâmico
public class Vetor {

    private int[] elements;
    private int total;

    public Vetor(){}

    //initial capacity
    public Vetor(int capacity)
    {
        this.elements = new int[capacity];
        this.total = 0;
    }

   public void add(Integer element)
   {
       if(this.isElementValid(element) && this.total < this.elements.length)
       {
           this.elements[total] = element;
           this.total++;
       }
   }

   public int getTotal()
   {
        return this.total;
   }

   private boolean isElementValid(int element)
   {
       if(!(element <= -1) && element > 0)
       {
           return true;
       }
       return false;
   }

    @Override
    public String toString() {

        Integer[] aux = new Integer[this.total];
//        aux[0] = 0;
//        aux[1] = 22;

        //Estava dando Exception pois eu estava tentando atribuir um elemento a um array com tamanho 0

        for (int i = 1; i <=this.total; i++)
        {
            if(this.elements[i] > 0){
               aux[i] = this.elements[i];
            }
        }

        return Arrays.toString(aux);
    }
}