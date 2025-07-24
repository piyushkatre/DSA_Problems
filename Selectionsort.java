public class Selectionsort {
    public static void sort(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            int minimumPos = i;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[minimumPos] > nums[j]) {
                    minimumPos = j;
                }
            }
            // swap 
            int temp = nums[minimumPos];
            nums[minimumPos] = nums[i];
            nums[i] = temp;
        }
    }

    public static void printArray(int nums[]){
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
