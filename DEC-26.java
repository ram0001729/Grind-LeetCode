 class Solution {

    // returns row index of maximum element in column col
    public int maxInCol(int[][] mat, int col) {
        int maxRow = 0;
        for (int i = 0; i < mat.length; i++) {
            if (mat[i][col] > mat[maxRow][col]) {
                maxRow = i;
            }
        }
        return maxRow;
    }

    public int[] findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int left = 0;
        int right = cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int maxRow = maxInCol(mat, mid);

            int leftVal = mid - 1 >= 0 ? mat[maxRow][mid - 1] : -1;
            int rightVal = mid + 1 < cols ? mat[maxRow][mid + 1] : -1;

            if (mat[maxRow][mid] > leftVal && mat[maxRow][mid] > rightVal) {
                return new int[]{maxRow, mid};
            } 
            else if (leftVal > mat[maxRow][mid]) {
                right = mid - 1;
            } 
            else {
                left = mid + 1;
            }
        }

        return new int[]{-1, -1}; // never reached
    }
}
