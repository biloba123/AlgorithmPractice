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
class _31_ {
    public int GetUglyNumber_Solution(int index) {
        if(index<=0) {
            return 0;
        }
        if (index==1) {
            return 1;
        }

        int[] nums=new int[index];
        nums[0]=1;
        int t2, t3, t5;
        t2=t3=t5=0;
        int n2=2, n3=3, n5=5, min;
        for (int i = 1; i < index; i++) {
            min=min(n2, n3, n5);
            nums[i]=min;

            //update t
            for(; n2<=min; t2++, n2=nums[t2]*2);
            for(; n3<=min; t3++, n3=nums[t3]*3);
            for(; n5<=min; t5++, n5=nums[t5]*5);
        }

        return nums[index-1];
    }

    private int min(int n2, int n3, int n5) {
        return Math.min(n5, Math.min(n2, n3));
    }
}
