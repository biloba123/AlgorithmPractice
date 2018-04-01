package offer;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/6
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
class _17_ {
    public static void printMatrixClockWisely(int[][] nums){
        if (nums == null || nums.length<1 || nums[0].length<1) {
            return;
        }

        int row=nums.length, col=nums[0].length;
        int count=(Math.min(row, col)-1)/2;
        for(int i=0; i<=count; i++){
            for(int j=i; j<col-i; j++){
                System.out.printf(nums[i][j]+" ");
            }

            for(int j=i+1; j<row-i; j++){
                System.out.printf(nums[j][col-i-1]+" ");
            }



            if((row-2*i>1) && (col-2*i>1)) {
                for (int j = col - i - 2; j >= i; j--) {
                    System.out.printf(nums[row - i - 1][j] + " ");
                }

                for (int j = row - i - 2; j > i; j--) {
                    System.out.printf(nums[j][i] + " ");
                }
            }
        }

    }
}
