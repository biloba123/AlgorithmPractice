package offer;

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
class _33_ {
    public int InversePairs(int[] array) {
        if (array == null || array.length < 1) {
            return 0;
        }

        int count[] = new int[1];
        count[0] = 0;
        div(array, 0, array.length - 1, count);

        return count[0];
    }

    private void div(int[] array, int start, int end, int[] count) {
        if (start >= end) {
            return;
        }

        int middle = (start + end) / 2;
        div(array, start, middle, count);
        div(array, middle + 1, end, count);
        merge(array, start, end, middle, count);
    }

    private void merge(int[] array, int start, int end, int middle, int[] count) {
        int temp[] = new int[end - start + 1];
        int i1 = middle, i2 = end, i = end - start;
        for (; i1 >= start && i2 > middle; ) {
            if (array[i1] > array[i2]) {
                count[0] += i2 - middle;
                count[0] %= 1000000007;
                temp[i--] = array[i1--];
            } else {
                temp[i--] = array[i2--];
            }
        }

        for (; i1 >= start; temp[i--] = array[i1--]) ;
        for (; i2 > middle; temp[i--] = array[i2--]) ;

        for (i1 = start, i = 0; i1 <= end; array[i1++] = temp[i++]) ;
    }
}
