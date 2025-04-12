package ferra.marcos.exercici4.nivell1;

import java.util.Arrays;
import java.util.List;

public class printMethodsReference {
    public static void main(String[] args) {
        List<String> mesos = Arrays.asList(
                "gener", "febrer", "març", "abril", "maig", "juny",
                "juliol", "agost", "setembre", "octubre", "novembre", "desembre"
        );

        mesos.forEach(System.out::println);
    }
}
