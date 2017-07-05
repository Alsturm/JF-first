package interfaces;

import java.util.function.BooleanSupplier;

@FunctionalInterface
public interface FuncInt extends BooleanSupplier {

    static FuncInt getInstance() {
        return () -> true;
    }

    static void main(String... args) {
        FuncInt instance = getInstance();
        System.out.println(instance.getAsBoolean());
    }
}
