public class TrappingRainwater {
    public static int trappedRainwater(int heights[], int width) {
        int n = heights.length;

        // maxLeft array
        int maxLeft[] = new int[n];
        maxLeft[0] = heights[0];
        for (int i = 1; i < maxLeft.length; i++) {
            if (maxLeft[i-1] > heights[i]) {
                maxLeft[i] = maxLeft[i-1];
            } else {
                maxLeft[i] = heights[i];
            }
        }

        // maxRight array
        int maxRight[] = new int[n];
        maxRight[n-1] = heights[n-1];
        for (int i = n-2; i >= 0; i--) {
            if (maxRight[i+1] > heights[i]) {
                maxRight[i] = maxRight[i+1];
            } else {
                maxRight[i] = heights[i];
            }
        }

        // trapped rainwater
        int trappedWater = 0;

        for (int i=0; i < n; i++) {
            int waterLevel = Math.min(maxLeft[i], maxRight[i]);
            trappedWater = trappedWater + (waterLevel - heights[i]) * width;
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int heights[] = {4,2,0,6,3,2,5};

        System.out.println("Total trapped Rainwater: "+ trappedRainwater(heights, 1));
    }
}
