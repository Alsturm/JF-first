package search.json.dom;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

@FunctionalInterface
public interface JsonBranch extends Json, Supplier<Map<String, Json>> {

    @Override
    default int elementsCount() {
        return get().size();
    }

    default Set<String> keys() {
        return get().keySet();
    }

    default Collection<Json> values() {
        return get().values();
    }
}
