public class MaxSumSubarray {
    public static int bruteForce(int nums[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum += nums[k];
                }
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    public static int prefixSum(int nums[]) {
        // prefix array 
        int prefixArray[] = new int[nums.length];
        prefixArray[0] = nums[0];
        for (int i=1; i<prefixArray.length; i++) {
            prefixArray[i] = prefixArray[i-1] + nums[i];
        }

        int maxSum = Integer.MIN_VALUE;
        int currsum = nums[0];

        for (int i=0; i<nums.length; i++) {
            int start = i;
            for (int j=i; j<nums.length; j++) {
                int end = j;

                currsum = start==0? prefixArray[end] : prefixArray[end] - prefixArray[start-1];
                maxSum = Math.max(maxSum, currsum);
            }
            
        }
        return maxSum;
    }

    public static int kadanesAlogorithm(int nums[]) {
        int maxSum = Integer.MIN_VALUE;
        int currsum = 0;

        for (int i = 0; i < nums.length; i++) {
            currsum += nums[i];
            if (currsum > maxSum) {
                maxSum = currsum;
            }

            if (currsum < 0) {
                currsum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        int arr1[] = {-2,-3,4,-1,-2,1,5,-3};
        int arr2[] = {-2,-1,-3,-1,-5};
        System.out.println("Maximum sum subarray: "+ bruteForce(arr2));
        System.out.println("Maximum sum subarray: "+ prefixSum(arr2));
        System.out.println("Maximum sum subarray: "+ kadanesAlogorithm(arr2));

    }
}
