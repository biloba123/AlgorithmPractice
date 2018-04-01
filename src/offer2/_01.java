package offer2;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/24
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
class _01 {
    public boolean Find(int target, int [][] array) {
        if (array==null || array.length<1 || array[0].length<1) {
            return false;
        }

        int row=array.length, col=array[0].length;
        int temp;
        for(int i=0, j=col-1; i<row && j>=0; ){
            temp=array[i][j];
            if (temp==target) {
                return true;
            }else if(target>temp){
                i++;
            }else {
                j--;
            }
        }

        return false;
    }
}
