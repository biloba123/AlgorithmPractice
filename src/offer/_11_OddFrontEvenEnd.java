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
class _11_OddFrontEvenEnd {
    public static void reOrderArray(int [] array) {
        if(array==null || array.length<1){
            throw new RuntimeException("Invalid");
        }

        int len=array.length;
        int oddIndex=0;
        int temp1=0;

        for(int i=0; i<len; i++){
            if(array[i]%2==1){
                temp1=array[i];
                for(int j=i; j>oddIndex;){
                    array[j]=array[--j];
                }
                array[oddIndex++]=temp1;
            }
        }
    }
}
