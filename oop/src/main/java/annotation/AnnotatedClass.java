package annotation;

import lombok.SneakyThrows;

@ClassPreamble(
        author = "John Doe",
        date = "3/17/2002",
        currentRevision = 6,
        lastModified = "4/12/2004",
        lastModifiedBy = "Jane Doe",
        reviewers = {"Alice", "Bob", "Cindy"})
public class AnnotatedClass {
    // ...

    @ClassPreamble(
            author = "John Doe",
            date = "3/17/2002",
            currentRevision = 6,
            lastModified = "4/12/2004",
            lastModifiedBy = "Jane Doe",
            reviewers = {"Alice", "Bob", "Cindy"})
    @SneakyThrows
    public static void main(String[] args) {
        System.out.println(
                AnnotatedClass.class
                        .getDeclaredMethod("main", String[].class)
                        .getAnnotation(ClassPreamble.class)
                        .author());
    }
}
