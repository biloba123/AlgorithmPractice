package offer;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/9
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
class _43_ {
    public boolean isContinuous(int[] numbers) {
        if (numbers == null || numbers.length != 5) {
            return false;
        }

        int pokers[] = new int[14];
        for (int number : numbers) {
            pokers[number]++;
        }

        int start = -1;
        for (int i = 1; i < 14; i++) {
            if (pokers[i] != 0) {
                if (pokers[i] == 1) {
                    if (start == -1) {
                        start = i;
                    }
                } else {
                    return false;
                }
            } else {
                if (start != -1) {
                    if (i - start == 5) {
                        break;
                    }
                    if (pokers[0] > 0) {
                        pokers[0]--;
                    } else {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
