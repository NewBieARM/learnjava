package 泛型;

public class RunGenericMethod {
    public static void main(String[] args) {
        GenericMethod gc = new GenericMethod();

        gc.method01("alex");
        gc.method01(123);
        gc.method01('a');
        gc.method01(true);

    }
}
