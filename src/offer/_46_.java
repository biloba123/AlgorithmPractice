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
class _46_ {
    public int Add(int num1,int num2) {
        int sum, carry;
        for (; num2!=0; num1=sum, num2=carry){
            sum=num1^num2;
            carry=(num1&num2)<<1;
        }
        return num1;
    }
}
