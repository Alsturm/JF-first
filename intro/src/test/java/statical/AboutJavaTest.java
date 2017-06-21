package statical;

import intro.AboutJava;
import lombok.SneakyThrows;
import lombok.val;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class AboutJavaTest {

    private final String LINE_SEPARATOR = System.getProperty("line.separator");

    @Test
    void printReleaseData() {
        assertThat(fromSystemOut(new AboutJava()::printReleaseData),
                is("Java already here!" + LINE_SEPARATOR));
    }

    @SneakyThrows
    private static String fromSystemOut(Runnable runnable) {

        PrintStream realOut = System.out;

        try (val out = new ByteArrayOutputStream();
             val printStream = new PrintStream(out)) {

            System.setOut(printStream);
            runnable.run();

            return new String(out.toByteArray()).intern();

        } finally {
            System.setOut(realOut);
        }
    }

}
