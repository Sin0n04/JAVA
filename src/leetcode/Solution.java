package leetcode;

/**
 Given an n x n binary grid, in one step you can choose two adjacent rows of the
 grid and swap them.

 A grid is said to be valid if all the cells above the main diagonal are zeros.


 Return the minimum number of steps needed to make the grid valid, or -1 if the
 grid cannot be valid.

 The main diagonal of a grid is the diagonal that starts at cell (1, 1) and
 ends at cell (n, n).


 Example 1:


 Input: grid = [[0,0,1],[1,1,0],[1,0,0]]
 Output: 3


 Example 2:


 Input: grid = [[0,1,1,0],[0,1,1,0],[0,1,1,0],[0,1,1,0]]
 Output: -1
 Explanation: All rows are similar, swaps have no effect on the grid.


 Example 3:


 Input: grid = [[1,0,0],[1,1,0],[1,1,1]]
 Output: 0



 Constraints:


 n == grid.length == grid[i].length
 1 <= n <= 200
 grid[i][j] is either 0 or 1


 Related Topics Array Greedy Matrix 👍 768 👎 84

 */

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minSwaps(int[][] grid) {
        int n = grid.length;
        int[] trailingzeros = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = n - 1; j >= 0; j--) {
                if (grid[i][j] == 0) {
                    count++;
                } else {
                    break;
                }
                trailingzeros[i] = count;
            }
        }





        int swaps = 0;
        for (int j = 0; j < n ; j++) {
            int requiredzeros = n - j - 1;
            int k = j;

            while (k < n && trailingzeros[k] < requiredzeros){
                k++;
            }

            if (k == n) return -1;

            while(k > j){
                int temp = trailingzeros[k];
                trailingzeros[k] = trailingzeros[k - 1];
                trailingzeros[k - 1] = temp;
                k--;
                swaps++;

            }

        }


        return swaps;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
