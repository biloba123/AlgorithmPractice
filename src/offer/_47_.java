package offer;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/9
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
class _47_ {
    public int Sum_Solution(int n) {
        int sum=0;
        boolean isEnd=n==0 ||  ((sum=n+Sum_Solution(n-1))==0);
        return sum;
    }
}
