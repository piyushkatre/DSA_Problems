public class spiral_matrix {
    public static void spriral(int mat[][]) {
        int startRow = 0, endRow = mat.length-1;
        int startCol = 0, endCol = mat[0].length-1;

        while (startRow <= endRow && startCol<= endCol) {
            // top 
            for (int j=startCol; j<=endCol; j++) {
                System.out.print(mat[startRow][j] + " ");
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(mat[i][endCol] + " ");
            }

            // bottom 
            for (int j=endCol-1; j>=startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(mat[endRow][j] + " ");
            }

            // left
            for (int i=endRow-1; i>=startRow+1; i--) {
                if (endCol == startCol) {
                    break;
                }
                System.out.print(mat[i][startRow] + " ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
    public static void main(String[] args) {
        int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
        spriral(mat);
    }
}
