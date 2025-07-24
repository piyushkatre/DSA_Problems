public class BubbleSort {
    public static void sort(int nums[]) {
        for (int i = 0; i <= nums.length-2; i++) {
            for (int j = 0; j <= nums.length-2-i; j++) {
                if (nums[j] > nums[j+1]) {
                    // swap
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    public static void printArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        System.out.print("Original Array: ");
        printArray(arr);
        sort(arr);
        System.out.print("Sorted array: ");
        printArray(arr);
    }
}
