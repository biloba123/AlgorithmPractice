package offer2;

import java.util.LinkedList;
import java.util.Stack;

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
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode next;

    TreeNode(int x) {
        val = x;
    }

    public static TreeNode createBinaryTree(int... vals) {
        if (vals == null || vals.length < 1) {
            return null;
        }

        return createBinaryTree(vals, 0);
    }

    private static TreeNode createBinaryTree(int[] vals, int index) {
        if (index >= vals.length || vals[index] == 0) {
            return null;
        }

        TreeNode node = new TreeNode(vals[index]);
        node.left = createBinaryTree(vals, index * 2 + 1);
        if (node.left != null) {
            node.left.next = node;
        }
        node.right = createBinaryTree(vals, index * 2 + 2);
        if (node.right != null) {
            node.right.next = node;
        }

        return node;
    }

    public void layer() {
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(this);
        TreeNode node;
        int count = 1, temp;
        while (!queue.isEmpty()) {
            temp = 0;
            for (int i = 0; i < count; i++) {
                node = queue.poll();
                System.out.print(node.val + " ");

                if (node.left != null) {
                    queue.offer(node.left);
                    temp++;
                }

                if (node.right != null) {
                    queue.offer(node.right);
                    temp++;
                }
            }
            count = temp;
            System.out.println();
        }
    }

    public void preOrderRec() {
        preOrderRec(this);
        System.out.println();
    }

    private void preOrderRec(TreeNode treeNode) {
        if (treeNode != null) {
            System.out.print(treeNode.val + " ");
            preOrderRec(treeNode.left);
            preOrderRec(treeNode.right);
        }
    }

    public void preOrder() {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(this);
        for (TreeNode node; !stack.isEmpty(); ) {
            node = stack.pop();
            System.out.print(node.val + " ");

            if (node.right != null) {
                stack.push(node.right);
            }

            if (node.left != null) {
                stack.push(node.left);
            }
        }

        System.out.println();
    }

    public void inOrderRec() {
        inOrderRec(this);
        System.out.println();
    }

    private void inOrderRec(TreeNode treeNode) {
        if (treeNode != null) {
            inOrderRec(treeNode.left);
            System.out.print(treeNode.val + " ");
            inOrderRec(treeNode.right);
        }
    }

    public void inOrder() {
        Stack<TreeNode> stack = new Stack<>();
        for (TreeNode node = this; node != null || !stack.isEmpty(); ) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }

            node = stack.pop();
            System.out.print(node.val + " ");
            node = node.right;
        }

        System.out.println();
    }


}
