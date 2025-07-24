public class linearsearch {
    public static int linearSearch(int nums[], int key) {
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == key) {
                return i;
            }
        }        
        
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,14,16};
        int key = 50;
        if (linearSearch(arr, key) == -1) {
            System.out.println("Key NOT Found!");
        } else {
            System.out.println("Key found at index: "+ linearSearch(arr,key));
        }

    }
}
