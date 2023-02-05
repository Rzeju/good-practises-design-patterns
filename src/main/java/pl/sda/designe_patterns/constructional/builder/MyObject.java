package pl.sda.designe_patterns.constructional.builder;

public class MyObject {

    private String name;
    private int number;
    private boolean isObject;
    private Object object;
    private String secondName;

    private MyObject(MyObjectBuilder myObjectBuilder) {
        this.name = myObjectBuilder.name;
        this.number = myObjectBuilder.number;
        this.isObject = myObjectBuilder.isObject;
        this.object = myObjectBuilder.object;
        this.secondName = myObjectBuilder.secondName;
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", isObject=" + isObject +
                ", object=" + object +
                ", secondName='" + secondName + '\'' +
                '}';
    }

    public static MyObjectBuilder builder() {
        return new MyObjectBuilder();
    }

    public static class MyObjectBuilder {

        private String name;
        private int number;
        private boolean isObject;
        private Object object;
        private String secondName;

        public MyObject build() {
            return new MyObject(this);
        }

        public MyObjectBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public MyObjectBuilder setNumber(int number) {
            this.number = number;
            return this;
        }

        public MyObjectBuilder setIsObject(boolean isObject) {
            this.isObject = isObject;
            return this;
        }

        public MyObjectBuilder setObject(Object object) {
            this.object = object;
            return this;
        }

        public MyObjectBuilder setSecondName(String secondName) {
            this.secondName = secondName;
            return this;
        }


    }
}
