package july.w3.reversewords;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        String s = solution.reverseWords("the sky is blue");
        assertThat(s).isEqualTo("blue is sky the");
    }

    @Test
    void test2() {
        String s = solution.reverseWords("  hello world!  ");
        assertThat(s).isEqualTo("world! hello");
    }

    @Test
    void test3() {
        String s = solution.reverseWords("a good   example");
        assertThat(s).isEqualTo("example good a");
    }
}