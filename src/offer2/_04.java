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
class _04 {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null || pre.length != in.length || pre.length < 1) {
            return null;
        }

        return rebuildTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    private TreeNode rebuildTree(int[] pre, int pStart, int pEnd, int[] in, int iStart, int iEnd) {
        if (pStart > pEnd || iStart > iEnd) {
            return null;
        }

        TreeNode node = new TreeNode(pre[pStart]);
        int rootIndex = getRootIndex(in, iStart, iEnd, node.val);
        int leftCount = rootIndex - iStart;

        if (rootIndex != -1) {
            node.left = rebuildTree(pre, pStart + 1, pStart + leftCount, in, iStart, rootIndex - 1);
            node.right = rebuildTree(pre, pStart + leftCount + 1, pEnd, in, rootIndex + 1, iEnd);
            return node;
        }

        return null;
    }

    private int getRootIndex(int[] in, int iStart, int iEnd, int root) {
        for (int i = iStart; i <= iEnd; i++) {
            if (in[i] == root) {
                return i;
            }
        }
        return -1;
    }
}
