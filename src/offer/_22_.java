package offer;

import java.util.ArrayList;

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
class _22_ {
    public static ArrayList<ArrayList<Integer>> findPath(TreeNode root, int expectedSum) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        if (root == null) {
            return lists;
        }

        ArrayList<TreeNode> list = new ArrayList<>();
        find(root, expectedSum, 0, list, lists);

        return lists;
    }

    private static void find(TreeNode node, int expectedSum, int curSum, ArrayList<TreeNode> list, ArrayList<ArrayList<Integer>> lists) {
        if (node != null) {
            list.add(node);
            curSum += node.val;
            if (curSum == expectedSum) {
                if (node.left == null && node.right == null) {
                    ArrayList<Integer> list1 = new ArrayList<>();
                    for (TreeNode treeNode : list) {
                        list1.add(treeNode.val);
                    }
                    lists.add(list1);
                }
            } else if (curSum < expectedSum) {
                find(node.right, expectedSum, curSum, list, lists);
                find(node.left, expectedSum, curSum, list, lists);
            }

            //所有路径遍历完后，移除该结点并返回
            //curSum不用管，因为它只是个值
            list.remove(node);
        }
    }
}
