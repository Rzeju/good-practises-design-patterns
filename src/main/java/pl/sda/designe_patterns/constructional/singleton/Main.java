package pl.sda.designe_patterns.constructional.singleton;

public class Main {

    public static void main(String[] args) {

        LazySingletonExample mySingleton1 = LazySingletonExample.getInstance();
        LazySingletonExample mySingleton2 = LazySingletonExample.getInstance();

        System.out.println(mySingleton1);
        System.out.println(mySingleton2);
        System.out.println(mySingleton1.equals(mySingleton2));

        EagerSingletonExample myEagerSingleton1 = EagerSingletonExample.getInstance();
        EagerSingletonExample myEagerSingleton2 = EagerSingletonExample.getInstance();

        System.out.println(myEagerSingleton1);
        System.out.println(myEagerSingleton2);
        System.out.println(myEagerSingleton1.equals(myEagerSingleton2));

        System.out.println(mySingleton1.equals(myEagerSingleton1));
    }
}
