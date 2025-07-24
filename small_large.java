public class small_large {
    public static void largeNum(int nums[]) {
        int largest = Integer.MIN_VALUE;
        for (int i=0; i<nums.length; i++) {
            if (largest < nums[i]) {
                largest = nums[i];
            }
        }

        System.out.println("Largest number in array: "+ largest);
    }

    public static void smallNum(int nums[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i=0; i<nums.length; i++) {
            if (smallest > nums[i]) {
                smallest = nums[i];
            }
        }

        System.out.println("Smallest number in array: "+ smallest);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,6,3,5};
        largeNum(arr);
        smallNum(arr);
    }
}
