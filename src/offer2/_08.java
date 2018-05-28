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
class _08 {
    public int JumpFloor(int target) {
        if (target < 1) {
            return 0;
        }

        switch (target) {
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                return JumpFloor(target - 1) + JumpFloor(target - 2);
        }
    }
}
