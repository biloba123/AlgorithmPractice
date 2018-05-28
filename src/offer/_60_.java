package offer;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/10
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
class _60_ {
    TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot == null || k < 1) {
            return null;
        }

        int[] which = {k};
        return inOrder(pRoot, which);
    }

    private TreeNode inOrder(TreeNode node, int[] which) {
        if (node == null) return null;

        TreeNode result = inOrder(node.left, which);
        if (result == null) {
            if (which[0] == 1) {
                return node;
            } else {
                which[0]--;
                return inOrder(node.right, which);
            }
        }

        return result;
    }
}
