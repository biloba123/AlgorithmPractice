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
public class Main {
    public static void main(String[] args) {
//        System.out.println(new _01().Find(11, get2DimenArr()));

//        new _03().printListFromTailToHead(
//                ListNode.createList(get1DimenArr())
//        ).forEach(integer -> System.out.println(integer));

//        new _04().reConstructBinaryTree(new int[]{1,2,3,4,5,6,7}, new int[]{3,2,4,1,6,5,7}).layer();

//        _05 queue=new _05();
//        queue.push(1);
//        queue.push(2);
//        System.out.println(queue.pop());
//        queue.push(3);
//        System.out.println(queue.pop());
//        System.out.println(queue.pop());

//        System.out.println(new _06().minNumberInRotateArray(new int[]{ 1, 1, 1}));

//        for (int i = 0; i < 10; i++) {
//            System.out.println(new _07().Fibonacci(i));
//        }

//        for (int i = 0; i < 10; i++) {
//            System.out.println(new _08().JumpFloor(i));
//        }

//        for (int i = 0; i < 10; i++) {
//            System.out.println(new _09().NumberOf1(i));
//        }

//        int[] num=new int[1];
//        new _10().duplicate(get1DimenArr(), get1DimenArr().length, num);
//        System.out.println(num[0]);

//        System.out.println(new _10().duplicate(new int[]{2,1,5,4,3,2,6,7}));

        TreeNode root = TreeNode.createBinaryTree(get1DimenArr());
        root.inOrder();

        System.out.println(new _11().GetNext(root.left).val);
    }

    private static int[] get1DimenArr() {
        return new int[]{1, 2, 3, 4, 0, 0, 5, 0, 0, 0, 0, 0, 0, 6, 7};
    }

    private static int[][] get2DimenArr() {
        return new int[][]{{1, 3, 4}, {2, 4, 5}, {7, 10, 11}};
    }
}
