package msisproblem;

public class MaximumSumIncreasingSubsequence {

        public static int maximumSumIncreasingSubsequence(int[] arr) {
            int n = arr.length;
            int[] dp = new int[n];
            dp[0] = arr[0];
            int maxSum = dp[0];

            for (int i = 1; i < n; i++) {
                dp[i] = arr[i];
                for (int j = 0; j < i; j++) {
                    if (arr[j] < arr[i]) {
                        dp[i] = Math.max(dp[i], dp[j] + arr[i]);
                    }
                }
                maxSum = Math.max(maxSum, dp[i]);
            }

            return maxSum;
        }
        public static void main(String[] args) {
            int[] arr = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11};
            int result = maximumSumIncreasingSubsequence(arr);
            System.out.println(result);
        }
    }


