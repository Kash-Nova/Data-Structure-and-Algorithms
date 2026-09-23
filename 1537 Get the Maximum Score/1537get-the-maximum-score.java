class Solution {
    public int maxSum(int[] nums1, int[] nums2) {
        
        int i = 0, j = 0;
        long sum1 = 0, sum2 = 0;
        long MOD = 1000000007;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {
                sum1 += nums1[i];
                i++;
            }
            
            else if (nums1[i] > nums2[j]) {
                sum2 += nums2[j];
                j++;
            }
            
            else {
                // Common element found
                long maxSum = Math.max(sum1, sum2) + nums1[i];

                sum1 = maxSum;
                sum2 = maxSum;

                i++;
                j++;
            }
        }

        // Add remaining elements
        while (i < nums1.length) {
            sum1 += nums1[i];
            i++;
        }

        while (j < nums2.length) {
            sum2 += nums2[j];
            j++;
        }

        return (int)(Math.max(sum1, sum2) % MOD);
    }
}