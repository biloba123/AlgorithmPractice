package offer;


import java.util.LinkedList;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/3
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @since
 */
public class Main {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 11, 14},
                {5, 10, 18, 22},
                {9, 32, 64, 77},
                {20, 33, 72, 88}
        };
//
//        System.out.println(_01_FindNumInArr.find(arr, 9));

//        char[] str=new char[20];
//        char[] temp="We are happy.".toCharArray();
//        for (int i = 0; i < temp.length; i++) {
//            str[i]=temp[i];
//        }
//        System.out.println(_02_Replace.replace(str, temp.length));
//        System.out.println(new String(str));
//        ArrayList list=new ArrayList(10);
//        System.out.println(_02_Replace.replaceSpace(new StringBuffer("We are Happy.")));

//        LinkedList linkedList=new LinkedList<Integer>();
//        linkedList.add(0, 11);
//        linkedList.add(1);
//        linkedList.add(2);
//        linkedList.add(0, 3);
//        linkedList.add(3, 5);
//        for (int i = 0; i < linkedList.size(); i++) {
//            System.out.print(linkedList.get(i)+" ");
//        }
//        System.out.println();
//        linkedList.reversePaint();

//        int[] preOrder={1, 2, 4, 7, 3, 5, 6, 8}, preOrder={4, 7, 2, 1, 5, 3, 8, 6};
//        _04_RebuildBinaryTree.preOrder(_04_RebuildBinaryTree.reBuildBinaryTree(preOrder, preOrder));

//        _05_TwoStacksToQueue.MyQueue<Integer> queue=new _05_TwoStacksToQueue.MyQueue<>();
//        queue.appendTail(1);
//        queue.appendTail(2);
//        System.out.println(queue.deleteHead());
//        queue.appendTail(3);
//        queue.appendTail(4);
//        System.out.println(queue.deleteHead());
//        System.out.println(queue.deleteHead());
//        System.out.println(queue.deleteHead());
//        System.out.println(queue.deleteHead());

//        int[] nums={3, 4, 5, 6, 1};
//        System.out.println(_06_MinInSpinArr.min(nums));

//        for (int i = 0; i < 10; i++) {
//            System.out.println(_07_Fibonacci.Fibonacci(i));
//        }
//
//        for (int i = 0; i < 12; i++) {
//            System.out.println(_08_NumberOf1.NumberOf1(i));
//        }
//
//        System.out.println(_08_NumberOf1.NumberOf1(-11));

//        _09_PrintOneToNthDigits.printOneToNthDigits(3);
//        int[] nums={1, 2, 7, 4, 5, 3};
//        _11_OddFrontEvenEnd.reOrderArray(nums);
//        for (int num : nums) {
//            System.out.print(num+" ");
//        }
//        int i=0;
//        i=i++;
//        System.out.println(i);

//        int[] nodes1={8, 8, 7, 9, 3, -1, -1, -1, -1, 4, 7};
//        int[] nodes2={8, 9, 2};
//        System.out.println(_15_.HasSubtree(buildBinaryTree(nodes1), buildBinaryTree(nodes2)));

//        int[] nodes={8, 9, 2, -1, -1, 1};
//        preOrder(_16_.getImageTree(buildBinaryTree(nodes)));

//        _17_.printMatrixClockWisely(arr);

//        int[] d1={1,2,3,4}, d2={2,4,3,1};
//        System.out.println(_19_.sequenseIsPop(d1, d2));
//        _20_.printFromToBottom(buildBinaryTree(nodes1));


//        System.out.println(_21_.verifySequenceOfBST(new int[]{7,8,9,13,17,21,20,15,10}));

//        _22_.findPath(buildBinaryTree(new int[]{1, 2, 3, 4, 1, 3, 2, -1, -1, -1, -1, -1, -1, -1, 1}), 7);

//        TreeNode list=_24_.convert(buildBinaryTree(new int[]{10, 8, 15, 7, 9}));
//        System.out.print(list.val+" ");
//        for(TreeNode n=list.right; !n.equals(list); n=n.right){
//            System.out.print(n.val+" ");
//        }


//        new _25_().Permutation("abb").forEach(s -> System.out.println(s));


//        new _27_().GetLeastNumbers_Solution(new int[]{4,5,1,6,2,7,3,8}, 4).forEach(integer -> System.out.print(integer+" "));

//        int nums[]={3, 32, 32324};
//        System.out.println(new _30_().PrintMinNumber(nums));

//        System.out.println(new _31_().GetUglyNumber_Solution(10));

//        String s="qqwerwjkcdje";
//        System.out.println(s.charAt(new _32_().FirstNotRepeatingChar(s)));

//        System.out.println(new _33_().InversePairs(new int[]{1,2,3,4,5,6,7,0}));
//        ListNode head1=new ListNode(1);
//        ListNode node=head1;
//        for (int i = 0; i < 5; i++) {
//            node.next=new ListNode(i+1);
//            node=node.next;
//        }
//
//        ListNode head2=new ListNode(99);
//        head2.next=head1;
//
//        System.out.println(new _34_().FindFirstCommonNode(head1, head2).val);


//        System.out.println(new _35_().GetNumberOfK(new int[]{3,3,3,3,4,5}, 3));

//        System.out.println(new _37_().IsBalanced_Solution(buildBinaryTree(new int[]{1,2,3,4,5,-1,6,-1,-1,7})));

//        int[] num1=new int[1], num2=new int[1];
//        new _38_().FindNumsAppearOnce(new int[]{2, 4, 3, 6, 3, 2 }, num1, num2);
//        System.out.println(num1[0]+" "+num2[0]);
//
//        int n=7;
//        System.out.println(n>>>2);
//        n>>>=2;
//        System.out.println(n);

//        for (Integer integer : new _39_().findNumbersWithSum(new int[]{1, 3, 5, 7, 8, 10, 15}, 15)) {
//            System.out.println(integer);
//        }

//        for (ArrayList<Integer> list : new _40_().FindContinuousSequence(15)) {
//            for (Integer integer : list) {
//                System.out.printf(integer+" ");
//            }
//            System.out.println();
//        }

//        System.out.println(new _41_().ReverseSentence("Imm"));
//        System.out.println(new _42_().LeftRotateString("abcdef", 3));

//        System.out.println(new _43_().isContinuous(new int[]{5,6,6,0,10}));

//        System.out.println(new _45_().LastRemaining_Solution(5, 1));

//        System.out.println(new _46_().Add(111, 899));

//        System.out.println(new _47_().Sum_Solution(3));

//        System.out.println(new _48_().StrToInt("-h123456"));

//        int [] duplication=new int[1];
//        System.out.println(new _49_().duplicate(new int[]{2,3,1,0,2,5,3}, 7, duplication)+" "+duplication[0]);

//        for (double v : new _50_().multiply(new double[]{1, 2, 3, 4, 5})) {
//            System.out.println(v);
//        }

//        boolean bool=true;
//        byte b=-128;
//        char c=65535;
//        int i=;
//        float f=0.266f;
//        double d=0.255;
//        System.out.println(_51_.match("", "*."));

//        System.out.println(_52_.isNumeric("1.2.3"));

//        System.out.println(_53_.firstAppearingOnce("google"));

//        ListNode list=new ListNode(1),
//                node1=new ListNode(3),
//                node2=new ListNode(2);
//        list.next=node1;
//        node1.next=node2;
//        node2.next=null;
////        System.out.println(new _54_().EntryNodeOfLoop(list).val);
//
//        list=new _55_().deleteDuplication(list);
//        for(ListNode node=list; node!=null; node=node.next){
//            System.out.println(node.val);
//        }

//        for (ArrayList<Integer> list : new _58_().Print(buildBinaryTree(new int[]{1, 2, 3, 4, -1, 5, 6}))) {
//            for (Integer integer : list) {
//                System.out.print(integer+" ");
//            }
//            System.out.println();
//        }

//        System.out.println(new _60_().KthNode(buildBinaryTree(new int[]{5,3,7,2,4,6,8}), 10).val);

//        char[] matrix="abcesfcsadee".toCharArray(), str="escede".toCharArray();
//        System.out.println(new _63_().hasPath(matrix, 3, 4, str));

//        System.out.println(JumpFloor(4));

//        System.out.println(Power(2.5, -2));

//        System.out.println(LastRemaining_Solution(3, 2));


    }

    public static int LastRemaining_Solution(int n, int m) {
        if (n < 1 || m < 1) {
            return 0;
        }
        LinkedList<Integer> childs = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            childs.add(i);
        }

        for (int index = 0; childs.size() > 1; childs.remove(index)) {
            index += m - 1;
            index %= childs.size();
        }

        return childs.get(0);
    }

    public static double Power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }

        double d = 1;
        for (int i = Math.abs(exponent); i > 0; i--, d *= base) ;

        return exponent > 0 ? d : 1 / d;
    }

    public static int JumpFloorII(int target) {
        return (int) Math.pow(2, target - 1);
    }

    public static int JumpFloor(int target) {
        if (target < 2) {
            return 1;
        }

        return JumpFloor(target - 1) + JumpFloor(target - 2);
    }


    public static void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    public static TreeNode buildBinaryTree(int[] nodes) {
        if (nodes == null || nodes.length < 1) {
            return null;
        }

        return build(nodes, 0);
    }

    private static TreeNode build(int[] nodes, int start) {
        int val = nodes[start];
        if (val == -1) {
            return null;
        } else {
            TreeNode node = new TreeNode(val);
            int left = start * 2 + 1;
            if (left < nodes.length) {
                node.left = build(nodes, left);
            }
            int right = left + 1;
            if (right < nodes.length) {
                node.right = build(nodes, right);
            }

            return node;
        }
    }


}

