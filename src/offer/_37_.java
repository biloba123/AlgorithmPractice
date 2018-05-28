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
class _37_ {
    public boolean IsBalanced_Solution(TreeNode root) {
        return isBlanced(root, new int[1]);
    }

    private boolean isBlanced(TreeNode root, int[] depth) {
        if (root == null) {
            depth[0] = 0;
            return true;
        }

        int[] leftDepth = new int[1], rightDepth = new int[1];
        if (isBlanced(root.left, leftDepth) && isBlanced(root.right, rightDepth)) {
            if (Math.abs(leftDepth[0] - rightDepth[0]) < 2) {
                depth[0] = Math.max(leftDepth[0], rightDepth[0]) + 1;
                return true;
            }
        }

        return false;
    }


}
