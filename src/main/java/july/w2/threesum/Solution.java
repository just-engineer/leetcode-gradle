package july.w2.threesum;

import java.security.cert.CollectionCertStoreParameters;
import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        int[] triplet = new int[3];
        for (int i = 0; i < nums.length; i++) {

            triplet[0] = nums[i];
            for (int i1 = i + 1; i1 < nums.length; i1++) {
                triplet[1] = nums[i1];

            }
        }


        return null;
    }
}