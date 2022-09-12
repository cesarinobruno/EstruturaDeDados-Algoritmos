package br.com.pilha;

import com.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T>
{

    public Pilha()
    {
        super();
    }

    public Pilha(int tamanho)
    {
        super(tamanho);
    }

    public int getTamanho()
    {
        return super.getTamanho();
    }
}
