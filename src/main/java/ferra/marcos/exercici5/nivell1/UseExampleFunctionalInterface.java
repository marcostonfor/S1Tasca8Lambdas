package ferra.marcos.exercici5.nivell1;

public class UseExampleFunctionalInterface {
    public static void main(String[] args) {

        ExampleFunctionalInterface numberPI = (pi) ->  {
            return pi;
        };
        System.out.println("El valor del numero PI es: " + numberPI.KcnowPi());
    }

}
