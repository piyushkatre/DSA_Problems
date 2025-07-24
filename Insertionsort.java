public class Insertionsort {
    public static void sort(int nums[]) {
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int prev = i-1;
            // finding position to insert
            while (prev >= 0 && nums[prev] > curr) {
                nums[prev+1] = nums[prev];
                prev--;
            }
            // insert
            nums[prev+1] = curr;
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
