package com.estruturadados.base;

import com.sun.xml.internal.ws.util.StringUtils;

public class EstruturaEstatica<T>
{

    protected T[] elementos;
    protected int tamanho;

    public EstruturaEstatica(int capacidade)
    {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public EstruturaEstatica()
    {
        this(10);
    }

    protected boolean adiciona(T elemento)
    {
        this.aumentaCapacidade();

        if(this.tamanho < this.elementos.length)
        {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    protected boolean estaVazio()
    {
        return this.tamanho == 0;
    }

    protected T verificarTopoPilha()
    {
        if(this.estaVazio())
        {
            return null;
        }
        return this.elementos[tamanho - 1];
    }

    protected int getTamanho()
    {
        return this.tamanho;
    }

    private void aumentaCapacidade()
    {
        if(this.tamanho == this.elementos.length)
        {
          T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
          for (int i = 0; i < this.elementos.length; i++)
          {
              //repassando cada elemento para o novo array c/ capacidade aumentada;
              elementosNovos[i] = this.elementos[i];
          }
          this.elementos = elementosNovos;
        }
    }

    protected T desempilha()
    {
        if(estaVazio())
        {
            return null;
        }

        T elemento = this.elementos[this.tamanho - 1];
        this.tamanho--;
        return elemento;
    }

    protected boolean adiciona(int posicao, T elemento)
    {
        if(!(posicao >= 0 && posicao < tamanho))
        {
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();

        //mover os elementos
        for(int i = this.tamanho - 1; i>-posicao; i--)
        {
            this.elementos[i+1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    @Override
    public String toString()
    {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i=0; i < this.tamanho-1; i++)
        {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if(this.tamanho > 0)
        {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }
}
