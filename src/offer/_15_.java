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
class _15_ {
    public static boolean HasSubtree(TreeNode root1, TreeNode root2) {
        //有一个为空树就不满足
        if (root1 == null || root2 == null) {
            return false;
        }

        boolean result = false;
        //A树的节点值等于B的根，则去匹配
        if (root1.val == root2.val) {
            result = match(root1, root2);
        }

        //匹配成功则直接返回
        if (result) {
            return true;
        }

        //不成功要判断左右子树
        return HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }

    private static boolean match(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }

        if (root1 == null) {
            return false;
        }

        if (root1.val == root2.val) {
            return match(root1.left, root2.left) && match(root1.right, root2.right);
        }

        return false;

    }
}
