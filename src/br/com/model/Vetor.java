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

   //pensar num método de sobrecarga
   public boolean existsInCollection(int position)
   {

     if(this.isElementValid(position))
     {
        if(this.elements[position] > 0)
        {
           return true;
        }
     }
     return false;
   }

   public int getTotal()
   {
        return this.total;
   }

   private boolean isElementValid(int element)
   {
       if(element > 0 && (element >=0 || element <= this.total))
       {
           return true;
       }
       return false;
   }

   public int get(int position)
   {
      if(position >= 0 && position <= this.total)
      {
          if(this.elements[position] > 0)
          {
              return this.elements[position];
          }
      }
      return -1;
   }

   @Override
   public String toString() {

       Integer[] aux = new Integer[this.total];

       for (int i = 0; i < this.total; i++)
       {
           aux[i] = this.elements[i];
       }

       return Arrays.toString(aux);
   }
}