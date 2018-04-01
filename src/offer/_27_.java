package offer;

import java.util.ArrayList;

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
class _27_ {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        if (input==null || input.length<1 || input.length<k) {
            return list;
        }

        int len=input.length, min, temp;
        for(int i=0; i<k; i++){
            min=i;
            for(int j=i+1; j<len; j++){
                if(input[min]>input[j]){
                    min=j;
                }
            }

            temp=input[min];
            input[min]=input[i];
            input[i]=temp;

            list.add(temp);
        }

        return list;
    }
}
