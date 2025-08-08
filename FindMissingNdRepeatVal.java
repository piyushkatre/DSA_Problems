import java.util.Arrays;
import java.util.HashMap;

public class FindMissingNdRepeatVal {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = grid[0].length;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < n; j++) {
                map.put(grid[i][j], map.getOrDefault(grid[i][j], 0) + 1);
            }
        }

        // Find Repeated value
        int a = -1;
        for (Integer num : map.keySet()) {
            if (map.get(num) > 1) {
                a = num;
            }
        }

        // Find Missing value
        int b = -1;
        for (int i = 1; i < Math.pow(n, 2)+1; i++) {
            if (! map.containsKey(i)) {
                b = i;
                break;
            }
        }


        return new int[] {a,b};
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,3},{2,2}};
        int[] result = findMissingAndRepeatedValues(matrix);
        System.out.println(Arrays.toString(result));

    }
}
