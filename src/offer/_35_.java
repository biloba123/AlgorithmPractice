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
class _35_ {
    public int GetNumberOfK(int[] array, int k) {
        if (array == null || array.length < 1 || array[0] > k || array[array.length - 1] < k) {
            return 0;
        }

        int firstIndex = getFirstK(array, k);
        if (firstIndex == -1) {
            return 0;
        }

//        System.out.println(firstIndex);
//        int count=1;
//        for(int i=firstIndex+1; array[i]==k; i++, count++);
//        return count;

        int lastIndex = getLastK(array, k);
        if (lastIndex == -1) {
            return 0;
        }

        return lastIndex - firstIndex + 1;
    }

    private int getLastK(int[] array, int k) {
        int start = 0, end = array.length - 1, middle;
        for (; start <= end; ) {
            middle = (start + end) / 2;
            if (array[middle] == k) {
                if (middle + 1 >= array.length || array[middle + 1] != k) {
                    return middle;
                } else {
                    start = middle + 1;
                }
            } else if (array[middle] > k) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }

        return -1;
    }

    private int getFirstK(int[] array, int k) {
        int start = 0, end = array.length - 1, middle;
        for (; start <= end; ) {
            middle = (start + end) / 2;
            if (array[middle] == k) {
                if (middle - 1 < 0 || array[middle - 1] != k) {
                    return middle;
                } else {
                    end = middle - 1;
                }
            } else if (array[middle] > k) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }
}
