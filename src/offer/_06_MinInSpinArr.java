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
class _06_MinInSpinArr {
    public static int min(int[] array){
        if(array==null || array.length<1){
            throw new RuntimeException("Invalid input.");
        }

        int mid=0;
        for(int low=0, high=array.length-1; low<high; ){
            if (high-low==1){
                return array[high];
            }

            mid=(low+high)/2;
            if(array[mid]>=array[low]){
                low=mid;
            }
            if(array[mid]<=array[high]){
                high=mid;
            }
        }

        return array[mid];
    }
}
