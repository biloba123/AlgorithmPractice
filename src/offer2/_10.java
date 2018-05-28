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
class _10 {
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        if (numbers == null || numbers.length < length) {
            return false;
        }

        int num;
        for (int i = 0; i < length; ) {
            num = numbers[i];
            if (num != i) {
                if (numbers[num] == num) {
                    duplication[0] = num;
                    return true;
                } else {
                    numbers[i] = numbers[num];
                    numbers[num] = num;
                }
            } else {
                i++;
            }
        }

        return false;
    }

    public int duplicate(int numbers[]) {
        if (numbers == null || numbers.length < 1) {
            return -1;
        }

        int low, high, middle;
        for (low = 1, high = numbers.length - 1; low != high; ) {
            middle = (low + high) >> 1;
            if (getCount(numbers, low, middle) > middle - low + 1) {
                high = middle;
            } else {
                low = middle + 1;
            }
        }

        return low;
    }

    private int getCount(int[] numbers, int low, int high) {
        int count = 0;
        for (int number : numbers) {
            if (number >= low && number <= high) {
                count++;
            }
        }

        return count;
    }
}