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
class _23_ {
    public static class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public static RandomListNode clone(RandomListNode head) {
        if (head == null) {
            return null;
        }

        cloneNodes(head);
        sibling(head);
        return reconnectNodes(head);
    }

    private static RandomListNode reconnectNodes(RandomListNode node) {
        RandomListNode newHead = node.next;
        for (RandomListNode node1 = newHead; node != null; node = node.next, node1 = node1.next) {
            node.next = node1.next;
            node1.next = node.next;
        }
        return newHead;
    }

    private static void sibling(RandomListNode node) {
        for (; node != null; node = node.next.next) {
            if (node.random != null) {
                node.next.random = node.random.next;
            }
        }
    }

    private static void cloneNodes(RandomListNode node) {
        for (; node != null; node = node.next.next) {
            RandomListNode newNode = new RandomListNode(node.label);
            newNode.next = node.next;
            node.next = newNode;
        }
    }
}
