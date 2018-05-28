package ali;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/17
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
public class Main {
    public static void main(String[] args) {
        int n = 3;
        int[][] e = {
                {0, 1, 1},
                {0, 0, 1},
                {1, 0, 0}};
        FindCycle tc = new FindCycle(n, e);
        tc.findCycle(1);

        if (!tc.getHasCycle())
            System.out.println("No Cycle.");
    }
}

class FindCycle {
    private int n;
    private int[] visited;//节点状态,值为0的是未访问的
    private int[][] e;//有向图的邻接矩阵，文件的依赖关系
    private ArrayList<Integer> trace = new ArrayList<Integer>();//从出发节点到当前节点的轨迹
    private boolean hasCycle = false;

    public FindCycle(int n, int[][] e) {
        this.n = n;
        visited = new int[n];
        Arrays.fill(visited, 0);
        this.e = e;
    }

    void findCycle(int v)   //递归DFS
    {
        if (visited[v] == 1) {
            int j;
            if ((j = trace.indexOf(v)) != -1) {
                hasCycle = true;
                while (j < trace.size()) {
                    System.out.print(trace.get(j) + " ");
                    j++;
                }
                System.out.print("\n");
                return;
            }
            return;
        }
        visited[v] = 1;
        trace.add(v);

        for (int i = 0; i < n; i++) {
            if (e[v][i] == 1)
                findCycle(i);
        }
        trace.remove(trace.size() - 1);
    }

    public boolean getHasCycle() {
        return hasCycle;
    }
}
