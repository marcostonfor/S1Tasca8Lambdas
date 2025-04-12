package ferra.marcos.exercici2.nivell1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class oWordFilterand5letters {

    public static void main(String[] args) {
        List<String> listWords = Arrays.asList("gat", "gos", "ocell", "peix", "tortuga");

        List<String> result = listWords.stream()
                .filter(s -> s.contains("o") && s.length() > 5).collect(Collectors.toList());

        System.out.println("Paraules que contenen la lletra 'o': " + result);

    }
}
