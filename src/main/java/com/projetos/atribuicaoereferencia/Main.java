package com.projetos.atribuicaoereferencia;

public class Main {
    public static void main(String[] args) {
        int intA = 2;
        int intB = intA;

        System.out.println("IntA =" + intA + " intB = " +intB);
        intA = 4;
        System.out.println("IntA =" + intA + " intB = " +intB);

        MeuOBJ objA = new MeuOBJ(1);
        MeuOBJ objB = objA;

        System.out.println("objA =" + objA + " objB = " +objB);
        objA.setNum(2);
        System.out.println("objA =" + objA + " objB = " +objB);

    }
}
