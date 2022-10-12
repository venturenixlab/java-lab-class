/**
 * do something
 * do something else
 * do something 3 times
 * do something else 3 times
 * calculate method long: 2
 * calculate method long: 200
 * calculate method long: 42768
 * calculate method short: -22768
 */
public class Exercise24 {
    public void doSomething() {
        System.out.println("do something");
    }

    // Code 3 doSomething() methods with same name, but with diff. parameter as signature

    public void calculate(byte i) {
        System.out.println("calculate method byte: " + i);
    }

    public void calculate(short i) {
        System.out.println("calculate method short: " + i);
    }

    public void calculate(long i) {
        System.out.println("calculate method long: " + i);
    }

    public static void main(String[] args) {
        Exercise24 c = new Exercise24();
        // During runtime, JVM knows which method should be referred to.
        // Code exercise
        c.doSomething();
        c.doSomething("something else");
        c.doSomething(3);
        c.doSomething("something else", 3);

        // Reading exercise
        c.calculate(2); // JVM auto promote it to int. If int not found, long method will be called
        c.calculate(200); // JVM auto promote it to int. If int not found, long method will be called
        c.calculate(42768);
        c.calculate((short) 42768); // specific the input data type as short
    }
}
