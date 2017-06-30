package search.json.dom;

public interface Json {

    default boolean isLeaf() {
        return this instanceof JsonLeaf;
    }

    default boolean isBranch() {
        return this instanceof JsonBranch;
    }

    static Json parseFromFile(String collect) {

//        Map<String, Json>

        return null;
    }

    int elementsCount();

    default JsonBranch getBranch(String meta) {
        throw new UnsupportedOperationException();
    }

    default <T> JsonLeaf<T> getLeaf(String id) {
        throw new UnsupportedOperationException();
    }
}
