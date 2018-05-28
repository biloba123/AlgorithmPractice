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
class _40_ {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        if (sum < 3) {
            return lists;
        }

        int bound = (sum + 1) / 2;
        int curSum = 3;
        int n;
        for (int start = 1, end = 2; start < bound; ) {
//            for (n = start; n <= end; curSum += n, n++) ;
            if (curSum == sum) {
                ArrayList list = new ArrayList();
                for (n = start; n <= end; list.add(n), n++) ;
                lists.add(list);
                end++;
                curSum += end;
            } else if (curSum > sum) {
                start++;
                curSum -= start - 1;
            } else {
                end++;
                curSum += end;
            }
        }

        return lists;
    }
}
