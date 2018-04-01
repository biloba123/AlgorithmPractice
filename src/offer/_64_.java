package offer;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/10
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
class _64_ {
    public int movingCount(int threshold, int rows, int cols) {
         if (threshold<0 || rows<1 || cols<1) {
            return 0;
        }
        boolean[] visited=new boolean[rows*cols];
        return movingCount(threshold, rows, cols, visited, 0, 0);
    }

    private int movingCount(int threshold, int rows, int cols, boolean[] visited, int row, int col) {
        int which=cols*row+col;
        if(row<0 || row>=rows || col<0 || col>=cols || visited[which]){
            return 0;
        }

        if(check(threshold, row, col)){
            visited[which]=true;
            return 1+movingCount(threshold, rows, cols, visited, row-1, col)
                    +movingCount(threshold, rows, cols, visited, row+1, col)
                    +movingCount(threshold, rows, cols, visited, row, col+1)
                    +movingCount(threshold, rows, cols, visited, row, col-1);
        }

        return 0;
    }

    private boolean check(int threshold, int row, int col) {
        int sum=0;
        for(; row!=0; sum+=row%10, row/=10);
        for(; col!=0; sum+=col%10, col/=10);

        return threshold>=sum;
    }
}
