import java.util.HashMap;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int single = 0;

        for (Integer num : map.keySet()) {
            if (map.get(num) == 1) {
                single = num;
            }
        }

        return single;
    }

    public static void main(String[] args) {
        int nums[] = {5,4,33,5,33,5};
        System.out.println(singleNumber(nums));
    }
}
