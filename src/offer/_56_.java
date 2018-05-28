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
class _56_ {
    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }

    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) {
            return null;
        }

        TreeLinkNode node = null;
        if (pNode.right != null) {//有右子树
            for (node = pNode.right; node.left != null; node = node.left) ;
        } else if (pNode.next != null) {
            if (pNode.next.right == pNode) {//是右节点
                for (node = pNode.next; node.next != null && node.next.right == node; node = node.next)
                    ;
                node = node.next;
            } else {//是左结点
                node = pNode.next;
            }
        }

        return node;
    }
}
