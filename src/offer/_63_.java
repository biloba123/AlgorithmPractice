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
class _63_ {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if (matrix==null || matrix.length<1 || rows<1 || cols<1 || rows*cols!=matrix.length
                || str==null || str.length<1 || str.length>matrix.length) {
            return false;
        }
        int[] visited=new int[matrix.length], len=new int[1];
        for (int i = 0; i < rows; i++) {
            for (int i1 = 0; i1 < cols; i1++) {
                if(matrix[i*cols+i1]==str[0] && hasPath(matrix, rows, cols, str, visited, len, i, i1)){
                    return true;
                }
            }
        }

        return false;
    }

    private boolean hasPath(char[] matrix, int rows, int cols, char[] str, int[] visited, int[] len, int row, int col) {
        int which=row*cols+col;//在一维数组中位置
        //超出界限、已经访问过、值不匹配
        if(row<0 || row>=rows || col<0 || col>=cols || visited[which]!=0 || matrix[which]!=str[len[0]]){
            return false;
        }

        //访问该字符
        visited[which]=1;
        len[0]++;

        //如果匹配完了
        if(len[0]==str.length){
            return true;
        }

        boolean able=hasPath(matrix, rows, cols, str, visited, len, row-1, col) ||
                hasPath(matrix, rows, cols, str, visited, len, row+1, col) ||
                hasPath(matrix, rows, cols, str, visited, len, row, col-1) ||
                hasPath(matrix, rows, cols, str, visited, len, row, col+1);
        //该点不行
        if (!able){
            visited[which]=0;
            len[0]--;
        }

        return able;
    }
}
