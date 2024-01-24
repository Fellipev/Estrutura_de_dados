package com.projeto.fila;

public class Main {

    public static void main(String[] args) {

        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

        System.out.println(minhaFila);

        Fila<Integer> filaInt = new Fila<>();
        filaInt.enqueue(1);
        filaInt.enqueue(2);
        filaInt.enqueue(3);

        System.out.println(filaInt);
    }
}
