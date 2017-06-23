package interfaces;

@FunctionalInterface
public interface Int1 {

    int f1 = 55;

    void m1(int i);

    @Private
    default void kjhsdfs() {
        System.out.println(f1);
    }

    static void main(String[] args) {
        Int1 int1 = i -> System.out.println(i);

        int1.m1(54);
    }
}
