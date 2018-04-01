package offer2;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/26
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
class _11 {
    public TreeNode GetNext(TreeNode pNode){
        if (pNode == null) {
            return null;
        }

        TreeNode node;
        //有右子树
        if (pNode.right != null) {
            for(node=pNode.right; node.left!=null; node=node.left);
            return node;
        }

        TreeNode parent=pNode.next;
        if (parent != null) {
            if(parent.left==pNode){
                return parent;
            }else {
                for(node=pNode; parent!=null && parent.right==node; node=parent, parent=node.next);
                if(parent!=null){
                    return parent;
                }
            }
        }

        return null;

    }
}
