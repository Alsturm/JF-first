package search.json.dom;

import java.util.function.Supplier;

@FunctionalInterface
public interface JsonLeaf<T> extends Json, Supplier<T> {

    @Override
    default int elementsCount() {
        return 1;
    }
}
