package ferra.marcos.exercici5.nivell1;
@FunctionalInterface
public interface ExampleFunctionalInterface {
    default double KcnowPi() {
        return KcnowPi(3.1415);
    }

    double KcnowPi(double PInumber);
}
