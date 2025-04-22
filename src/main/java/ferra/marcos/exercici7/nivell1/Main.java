package ferra.marcos.exercici7.nivell1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of names and text strings
        List<String> texts = new ArrayList<>();
        texts.add("Anna");
        texts.add("Christopher");
        texts.add("Bob");
        texts.add("Elizabeth");
        texts.add("Jo");
        texts.add("Michael");

        System.out.println("Original list:");
        texts.forEach(System.out::println);

        // Sort the list from shortest to longest string
        Collections.sort(texts, Comparator.comparingInt(String::length).reversed());

        System.out.println("\nSorted list (from shortest to longest):");
        texts.forEach(System.out::println);
    }
}