package pl.sda.designe_patterns.constructional.singleton;

public class LazySingletonExample {

    private static LazySingletonExample instance;

    private LazySingletonExample() {

    }

    public static LazySingletonExample getInstance() {
        if (instance == null) {
            instance = new LazySingletonExample();
        }

        return instance;
    }
}
