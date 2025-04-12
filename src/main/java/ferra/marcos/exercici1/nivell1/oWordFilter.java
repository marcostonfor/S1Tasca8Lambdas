package ferra.marcos.exercici1.nivell1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class oWordFilter {

    public static void main(String[] args) {
        List<String> llista = Arrays.asList("gat", "gos", "ocell", "peix", "tortuga");

        List<String> ambO = llista.stream()
                .filter(s -> s.contains("o"))
                .collect(Collectors.toList());

        System.out.println("Paraules que contenen la lletra 'o': " + ambO);

    }
}
