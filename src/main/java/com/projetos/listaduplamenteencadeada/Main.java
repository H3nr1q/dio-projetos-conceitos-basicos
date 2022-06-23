package com.projetos.listaduplamenteencadeada;

public class Main {
    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> minhaListaDuplEncadeada = new ListaDuplamenteEncadeada<>();

        minhaListaDuplEncadeada.add("c1");
        minhaListaDuplEncadeada.add("c2");
        minhaListaDuplEncadeada.add("c3");
        minhaListaDuplEncadeada.add("c4");
        minhaListaDuplEncadeada.add("c5");
        minhaListaDuplEncadeada.add("c6");
        minhaListaDuplEncadeada.add("c7");

        System.out.println(minhaListaDuplEncadeada);

        minhaListaDuplEncadeada.remove(3);
        minhaListaDuplEncadeada.add(3, "99");

        System.out.println(minhaListaDuplEncadeada);

        System.out.println(minhaListaDuplEncadeada.get(3));

    }
}
