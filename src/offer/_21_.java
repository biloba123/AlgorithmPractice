package offer;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/6
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
class _21_ {
    public static boolean verifySequenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length < 1) {
            return false;
        }
        return verify(sequence, 0, sequence.length - 1);
    }

    private static boolean verify(int[] sequence, int start, int end) {
        if (start >= end) {
            return true;
        }


        int root = sequence[end];
        int div = start;
        for (; sequence[div] < root; div++) ;
        for (int i = div; i < end; i++) {
            if (sequence[i] < root) {
                return false;
            }
        }
        return verify(sequence, start, div - 1) && verify(sequence, div, end - 1);
    }
}
