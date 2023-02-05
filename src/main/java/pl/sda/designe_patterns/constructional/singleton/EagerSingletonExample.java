package pl.sda.designe_patterns.constructional.singleton;

public class EagerSingletonExample {

    private static final EagerSingletonExample instance = new EagerSingletonExample();

    private EagerSingletonExample() {

    }

    public static EagerSingletonExample getInstance() {
        return instance;
    }
}
