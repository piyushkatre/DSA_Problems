import java.util.Arrays;

public class MergeTwoSortedArr {
    public static void main(String[] args) {
        int[] nums1 = {1,2,5,0,0,0};
        int[] nums2 = {2,3,4};
        int m = 3;
        int n = 3;

        int j=0;
        int i = m;
        while (j < n && i < m+n) {
            nums1[i] = nums2[j];
            j++;
            i++;
        }

        Arrays.sort(nums1);

        for (int k=0; k < nums1.length; k++) {
            System.out.print(nums1[k] + " ");
        }
    }
}
