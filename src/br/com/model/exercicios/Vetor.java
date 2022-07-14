package br.com.model.exercicios;

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
        this.increaseSize();

        if(this.isElementValid(element))
        {
            this.elements[total] = element;
            this.total++;
        }
    }

    public void remove(int position)
    {
        this.positionIsValid(position);

        for(int x = position; x <= this.total - 1; x++)
        {
            this.elements[x] = this.elements[x+1];
        }
        this.total--;
    }

    public int getTotal()
    {
        return this.total;
    }

    private void positionIsValid(int position)
    {
        if(position < 0)
        {
            throw new IllegalArgumentException("Position invalid");
        }
    }

    private boolean isElementValid(int element)
    {
        if(element > 0 && (element >=0 || element <= this.total))
        {
            return true;
        }
        return false;
    }

    public void increaseSize()
    {
        //has no capacity
        if(this.total == this.elements.length)
        {
            int aux[] = new int[this.elements.length * 2];

            int count = 0;

            while (count < this.elements.length)
            {
                aux[count] = this.elements[count];
                count++;
            }
            //return to current collection
            this.elements = aux;
        }
    }

    public int get(int index)
    {
        if(index >= 0 && index <= this.total)
        {
            if(this.elements[index] > 0)
            {
                return this.elements[index];
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