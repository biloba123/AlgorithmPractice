package offer;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/4
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
class _04_RebuildBinaryTree {
    public static TreeNode reBuildBinaryTree(int[] pre, int[] in){
        if (pre!=null && pre.length<1 && in!=null && in.length<1) {
            return null;
        }
        return reBuild(pre, 0, pre.length-1, in, 0, in.length-1);
    }

    public static TreeNode reBuild(
            int[] preOrder, int pStart, int pEnd,
            int[] inOrder, int iStart, int iEnd
    ){
        if (pStart>pEnd || iStart>iEnd){
            return null;
//        }else if(pStart==pEnd || iStart==iEnd){
//            TreeNode node=new TreeNode();
//            node.val=preOrder[pStart];
//            return node;
        }else {
            int rootVal=preOrder[pStart];
            TreeNode root=new TreeNode(rootVal);
            int middle=find(inOrder, iStart, iEnd, rootVal);
            int leftCount=middle-iStart;
            int rightCount=iEnd-middle;
            root.left =reBuild(
                    preOrder, pStart+1, pStart+leftCount,
                    inOrder, iStart, middle-1
            );
            root.right =reBuild(
                    preOrder, pEnd-rightCount+1, pEnd,
                    inOrder, middle+1, iEnd
            );
            return root;
        }
    }

    public static int find(int[] nums, int start, int end, int key){
        if (start>end) return -1;

        for (; start<=end; start++){
            if (nums[start]==key)
                return start;
        }

        return -1;
    }
}
