public class PairsInAnArray {
    public static void pairsInArray(int nums[]) {
        for (int i=0; i<nums.length-1; i++) {
            for (int j=i+1; j<nums.length; j++) {
                System.out.print("("+ nums[i] + "," + nums[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        pairsInArray(arr);

    }
}
