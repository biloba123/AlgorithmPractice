package offer;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/7
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
class _26_ {
    public int MoreThanHalfNum_Solution(int [] array) {
        if (array == null || array.length<1) {
            return 0;
        }

        int num=array[0], count=0;
        for (int n : array) {
            if(count==0){
                num=n;
                count=1;
            }else {
                if(num==n){
                    count++;
                }else {
                    count--;
                }
            }
        }

        count=0;
        for (int n : array) {
            if (n==num) {
                count++;
            }
        }

        if(count>array.length/2){
            return num;
        }else {
            return 0;
        }
    }
}
