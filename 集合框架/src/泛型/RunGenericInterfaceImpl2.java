package 泛型;


public class RunGenericInterfaceImpl2 {
    public static void main(String[] args) {
        GenericInterfaceImpl2<String> impl2 = new GenericInterfaceImpl2<String>();
        impl2.method("alex");

        GenericInterfaceImpl2<Double> impl21 = new GenericInterfaceImpl2<>();
        impl21.method(2.333);

    }
}
