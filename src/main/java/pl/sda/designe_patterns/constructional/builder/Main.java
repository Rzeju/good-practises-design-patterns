package pl.sda.designe_patterns.constructional.builder;

public class Main {

    public static void main(String[] args) {

        MyObject myObject = MyObject.builder()
                .setName("Name")
                .setNumber(10)
                .setIsObject(true)
                .setObject(new Object())
                .setSecondName("SecondName")
                .build();

        System.out.println(myObject);
    }
}
