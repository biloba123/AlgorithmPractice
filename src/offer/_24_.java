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
class _24_ {
    public static TreeNode convert(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode head = root;
        for (; head.left != null; head = head.left) ;
        TreeNode tail[] = new TreeNode[1];
        convertCore(root, tail);

        return head;

//        ArrayList<TreeNode> list=new ArrayList<>();
//        inOrder(root, list);
//        TreeNode node1, node2;
//        for (int i = 0; i < list.size()-1; i++) {
//            node1=list.get(i);
//            node2=list.get(i+1);
//            node1.right=node2;
//            node2.left=node1;
//        }
//        node1=list.get(0);
//        node2=list.get(list.size()-1);
//        node1.left=node2;
//        node2.right=node1;
//        list=null;
//        return node1;
    }

    private static void convertCore(TreeNode treeNode, TreeNode[] tail) {
        if (treeNode != null) {
            if (treeNode.left != null) {
                convertCore(treeNode.left, tail);
            }

            treeNode.left = tail[0];
            if (tail[0] != null) {
                tail[0].right = treeNode;
            }
            tail[0] = treeNode;

            if (treeNode.right != null) {
                convertCore(treeNode.right, tail);
            }
        }
    }

//    private static void inOrder(TreeNode node, ArrayList<TreeNode> list) {
//        if(node==null) return;
//
//        inOrder(node.left, list);
//        list.add(node);
//        inOrder(node.right, list);
//    }
}
