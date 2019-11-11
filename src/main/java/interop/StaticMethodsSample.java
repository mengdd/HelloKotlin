package interop;

public class StaticMethodsSample {
    public static void main(String[] args) {
        StaticMethodsDemoClass.Companion.sayHello();
        //StaticMethodsDemoClass.sayHello(); // error
        SingletonObject.INSTANCE.sayWorld();

        StaticMethodsDemoClass.Companion.sayHelloStatic(); // ok, but not necessary
        StaticMethodsDemoClass.sayHelloStatic();
        SingletonObject.sayWorldStatic();
    }
}
