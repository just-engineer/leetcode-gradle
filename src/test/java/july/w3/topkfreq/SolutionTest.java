package july.w3.topkfreq;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void name() {

        int[] result = solution.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        assertThat(result).isEqualTo(new int[]{1, 2});
    }

    @Test
    void name1() {
        int[] result = solution.topKFrequent(new int[]{1}, 1);
        assertThat(result).isEqualTo(new int[]{1});
    }
}