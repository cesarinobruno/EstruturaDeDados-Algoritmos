package br.com.main.pilha;

import java.util.Stack;

public class API_JAVA_STACK {

    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();

        System.out.println(stack.capacity());
        System.out.println(stack.empty());

        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.peek());
        System.out.println(stack.firstElement());

        System.out.println(stack.pop());

        System.out.println(stack.add(50));

        System.out.println(stack);
    }
}
