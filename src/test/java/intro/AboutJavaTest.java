package intro;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import org.junit.jupiter.api.Test;

import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AboutJavaTest {

    @Test
    void printReleaseData() {
        PrintStream out = System.out;
        ByteOutputStream out1 = new ByteOutputStream();
        PrintStream out2 = new PrintStream(out1);
        System.setOut(out2);
        AboutJava aboutJava = new AboutJava();
        aboutJava.printReleaseData();
        System.setOut(out);

        assertTrue(new String(out1.getBytes()).startsWith("Java already here!\n"));
    }

}