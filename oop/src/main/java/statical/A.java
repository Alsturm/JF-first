package statical;

public class A {
    public static void m1() {
        System.out.println("123");
    }

    public static void main(String[] args) {
        A a = null;

        a.m1();

        System.out.println(null instanceof Object);
    }
}
