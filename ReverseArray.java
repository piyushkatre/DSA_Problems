public class ReverseArray {
    public static void reverseAnArray(int nums[]) {
        int first = 0, last = nums.length - 1;
        while (first < last) {
            // swap
            int temp = nums[last];
            nums[last] = nums[first];
            nums[first] = temp;
            first++;
            last--;
        }
    }

    public static void printArray(int nums[]) {
        for (int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        System.out.print("Original Array: ");
        printArray(arr);
        reverseAnArray(arr);
        System.out.print("Reverse array: ");
        printArray(arr);

    }
}
