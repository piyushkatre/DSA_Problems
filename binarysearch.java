public class binarysearch {
    public static int binarySearch(int nums[], int key) {
        int start = 0, end = nums.length - 1;

        for (int i=0; i<nums.length; i++) {
            int mid = start + (end - start)/2;
            if (nums[mid] == key) {
                return mid;
            } else if (nums[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14};
        int key = 10;
        int index = binarySearch(arr, key);
        if (index == -1) {
            System.out.println("Key NOT Found!!");
        } else {
            System.out.println("Key found at index: "+ index);
        }
    }
}
