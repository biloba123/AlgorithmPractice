package offer;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/3
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @since
 */
class _01_FindNumInArr {
    public static boolean find(int[][] array, int target) {
        if (array == null || array.length < 1 || array[0].length < 1) return false;

        int row = array.length, col = array[0].length;
        for (int i = 0, j = col - 1; i < row && j >= 0; ) {
            if (array[i][j] > target) {
                j--;
            } else if (array[i][j] < target) {
                i++;
            } else {
                System.out.println(i + " " + j);
                return true;
            }
        }

        return false;
    }
}
