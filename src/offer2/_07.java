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
class _07 {
    public int Fibonacci(int n) {
        if(n<1){
            return 0;
        }

        int a=1, b=1;
        for(int i=2; i<n; i+=2){
            a=a+b;
            b=a+b;
        }

        return n%2==0? b: a;
    }
}
