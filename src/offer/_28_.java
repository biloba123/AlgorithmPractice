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
class _28_ {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length < 1) {
            return 0;
        }

        int maxSum = Integer.MIN_VALUE, currentSum = 0;
        for (int i : array) {
            if (currentSum <= 0) {
                currentSum = i;
            } else {
                currentSum += i;
            }

            if (maxSum < currentSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }
}
