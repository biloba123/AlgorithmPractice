package offer;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/5
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
class _07_Fibonacci {
    public static int Fibonacci(int n) {
        if (n<=0){
            return 0;
        }

        int a=0, b=1;
        for(; n>1; n-=2){
            a+=b;
            b+=a;
        }

        return n==0?a:b;
    }
}
