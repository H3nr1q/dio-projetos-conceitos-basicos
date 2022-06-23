package com.projetos.fila;

public class Main {

    public static void main(String[] args) {

        //usando classe fila
        Fila minhaFila = new Fila();
        minhaFila.enqueue(new No("primeiro"));
        minhaFila.enqueue(new No("segundo"));
        minhaFila.enqueue(new No("terceiro"));
        minhaFila.enqueue(new No("quarto"));

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        minhaFila.enqueue(new No("ultimo"));

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

        System.out.println(minhaFila);

        //usando classe fila refatorada
        FilaRefatorada minhaFilaReforada = new FilaRefatorada();
        minhaFilaReforada.enqueue("primeiro");
        minhaFilaReforada.enqueue("segundo");
        minhaFilaReforada.enqueue("terceiro");
        minhaFilaReforada.enqueue("quarto");

        System.out.println(minhaFilaReforada);

        System.out.println(minhaFilaReforada.dequeue());

        System.out.println(minhaFilaReforada);

        minhaFilaReforada.enqueue(new No("ultimoFilaRefatorada"));

        System.out.println(minhaFilaReforada);

        //usando fila refatorada com novo nó do tipo generics

        //tipo de fila string
        FilaRefatorada<String> minhaFilaString = new FilaRefatorada<>();
        minhaFilaString.enqueue("primeiro");
        minhaFilaString.enqueue("segundo");
        minhaFilaString.enqueue("terceiro");
        minhaFilaString.enqueue("quarto");

        System.out.println(minhaFilaString);
        System.out.println(minhaFilaString.dequeue());
        System.out.println(minhaFilaString);
        minhaFilaString.enqueue("ultimooooo");
        System.out.println(minhaFilaString);

        //tipo de fila inteiro
        FilaRefatorada<Integer> minhaFilaInteger = new FilaRefatorada<>();
        minhaFilaInteger.enqueue(1);
        minhaFilaInteger.enqueue(2);
        minhaFilaInteger.enqueue(3);
        minhaFilaInteger.enqueue(4);

        System.out.println(minhaFilaInteger);
        System.out.println(minhaFilaInteger.dequeue());
        System.out.println(minhaFilaInteger);
        minhaFilaInteger.enqueue(9999);
        System.out.println(minhaFilaInteger);
    }

}
