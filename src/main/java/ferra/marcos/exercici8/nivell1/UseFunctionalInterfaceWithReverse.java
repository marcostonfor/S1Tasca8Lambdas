package ferra.marcos.exercici8.nivell1;

public class UseFunctionalInterfaceWithReverse {
    public static void main(String[] args) {
        FunctionalInterfaceWithReverse message = (String reversedMessage) -> {
             return new StringBuilder(reversedMessage).reverse().toString();
        };

        System.out.println("Esta frase al reves dice: " + message.reverse());
    }
}
