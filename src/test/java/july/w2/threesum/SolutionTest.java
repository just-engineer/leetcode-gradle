package july.w2.threesum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    private final Solution solution = new Solution();

    @Test
    void name() {
        int[] ints = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = solution.threeSum(ints);

        Integer[] first = {-1, 0, 1};
        Integer[] second = {-1, -1, 2};
        assertThat(lists)
                .hasSize(2)
                .containsExactly(Arrays.asList(first), Arrays.asList(second));
    }
}