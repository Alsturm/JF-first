package search;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;

class StringsTest {
    @Test
    void countRepeat() {
        MatcherAssert.assertThat(Strings.countRepeat("bcbcabc", "bc"), is(3));
        MatcherAssert.assertThat(Strings.countRepeat("bcbcabc1", "bc"), is(3));
        MatcherAssert.assertThat(Strings.countRepeat("abcbcabc", "bc"), is(3));
        MatcherAssert.assertThat(Strings.countRepeat("abcbcabc1", "bc"), is(3));
        MatcherAssert.assertThat(Strings.countRepeat("a1", "bc"), is(0));
        MatcherAssert.assertThat(Strings.countRepeat("a1", "a"), is(1));
        MatcherAssert.assertThat(Strings.countRepeat("a", "ab"), is(0));
        MatcherAssert.assertThat(Strings.countRepeat("", "ab"), is(0));
        MatcherAssert.assertThat(Strings.countRepeat("aaaa", "aa"), is(3));

//        MatcherAssert.assertThat(Strings.countRepeat("a1", ""), is(2));
    }

}