package ferra.marcos.exercici8.nivell1;

public interface FunctionalInterfaceWithReverse {

   default String reverse() {
        return new StringBuilder("Hola cómo estás!!").reverse().toString();
    }

    String reverse(String message);
}
