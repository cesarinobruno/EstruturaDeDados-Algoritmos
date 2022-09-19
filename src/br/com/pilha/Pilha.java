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

    public boolean estaVazio() { return super.estaVazio(); }

    public void empilha(T elemento) { super.adiciona(elemento); }

    public T verificarTopoPilha() { return super.verificarTopoPilha(); }

    public T desempilha() { return super.desempilha(); }
}
