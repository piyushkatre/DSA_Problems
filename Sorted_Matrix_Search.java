public class Sorted_Matrix_Search {
    public static boolean staircaseSearch(int mat[][], int target) {
        int row = 0, col = mat[0].length-1;

        while (row<=mat.length-1 && col >= 0) {
            if (mat[row][col] == target) {
                System.out.println("Target Found at: ("+ row + "," + col + ")");
                return true;
            } else if (mat[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }

        System.out.println("Not Found!!");
        return false;
    }
    public static void main(String[] args) {
        int mat[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        staircaseSearch(mat, 52);
    }
}
