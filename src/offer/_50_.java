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
class _50_ {
    public int[] multiply(int[] data) {
        if (data == null || data.length < 1) {
            return null;
        }

        int[] muls = new int[data.length];
        muls[0] = 1;
        for (int i = 1; i < data.length; i++) {
            muls[i] = muls[i - 1] * data[i - 1];
        }

        double temp = 1;
        for (int i = data.length - 2; i >= 0; i--) {
            temp = temp * data[i + 1];
            muls[i] *= temp;
        }

        return muls;
    }
}
