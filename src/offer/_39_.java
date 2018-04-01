package offer;

import java.util.ArrayList;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/8
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
class _39_ {
    public ArrayList<Integer> findNumbersWithSum(int[] data, int sum) {
        ArrayList<Integer> list=new ArrayList<>();
        if (data==null || data.length<2) {
            return list;
        }

        int s=0;
        for(int start=0, end=data.length-1; start<end; ){
            s=data[start]+data[end];
            if(s==sum){
                list.add(data[start]);
                list.add(data[end]);
                break;
            }else if(s>sum){
                end--;
            }else{
                start++;
            }
        }

        return list;
    }
}
