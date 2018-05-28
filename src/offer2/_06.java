package offer2;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/24
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
class _06 {
    public int minNumberInRotateArray(int[] array) {
        if (array == null || array.length < 1) {
            return 0;
        }

        int low = 0, high = array.length - 1;
        int mid;
        while (low != high) {
            mid = (low + high) / 2;
            if (array[low] <= array[mid] && array[mid] > array[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return array[low];
    }
}
