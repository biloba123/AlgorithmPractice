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
class _16_ {
    public static TreeNode getImageTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        exchange(root);
        return root;
    }

    private static void exchange(TreeNode node) {
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        if (node.left != null) {
            exchange(node.left);
        }
        if (node.right != null) {
            exchange(node.right);
        }
    }
}
