package com.projetos.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Carro> hasSetCarros = new HashSet<>();

        hasSetCarros.add(new Carro("Ford"));
        hasSetCarros.add(new Carro("Chevrolet"));
        hasSetCarros.add(new Carro("Volkswagen"));
        hasSetCarros.add(new Carro("Peugeot"));
        hasSetCarros.add(new Carro("Renault"));
        hasSetCarros.add(new Carro("Ferrari"));

        System.out.println(hasSetCarros);

        Set<Carro> treeSetCarros = new TreeSet<>();
        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Chevrolet"));
        treeSetCarros.add(new Carro("Ferrari"));
        treeSetCarros.add(new Carro("Volkswagen"));
        treeSetCarros.add(new Carro("Peugeot"));
        treeSetCarros.add(new Carro("Renault"));

        System.out.println(treeSetCarros);
    }
}
