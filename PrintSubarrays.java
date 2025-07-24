public class PrintSubarrays {
    public static void printSubarray(int nums[]) {
        for (int i=0; i<nums.length; i++) {
            int start = i;
            for (int j=i; j<nums.length; j++) {
                int end = j;
                for (int k=start; k<=end; k++) {
                    System.out.print(nums[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printSubarray(arr);
    }
}
